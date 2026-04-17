package Visitor;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator implements ReportVisitor {

    private List<Object[]> rows = new ArrayList<>();
    private String[] columns = {};
    private String reportSummary = "";

    public List<Object[]> getRows() {
        return rows;
    }

    public String[] getColumns() {
        return columns;
    }

    public String getSummary() {
        return reportSummary;
    }

    @Override
    public void visit(TreatmentReport report) {
        columns = new String[]{"Patient Name", "Doctor Assigned",
            "Prescription", "Next Appointment"};
        rows.clear();

        String sql = "SELECT p.full_name, tp.doctor_assigned, "
                + "tp.prescription, tp.next_appointment "
                + "FROM treatment_plans tp "
                + "JOIN patients p ON tp.patient_id = p.patient_id "
                + "WHERE (? = '' OR p.full_name LIKE ?) "
                + "AND (tp.created_at >= ? OR ? = '') "
                + "ORDER BY tp.created_at DESC";

        try (PreparedStatement stmt = DBConnection.getInstance()
                .getConnection().prepareStatement(sql)) {

            String nameFilter = "%" + report.getPatientName() + "%";
            stmt.setString(1, report.getPatientName());
            stmt.setString(2, nameFilter);
            stmt.setString(3, report.getFromDate().isEmpty() ? "2000-01-01" : report.getFromDate());
            stmt.setString(4, report.getFromDate());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getString("full_name"),
                    rs.getString("doctor_assigned"),
                    rs.getString("prescription"),
                    rs.getString("next_appointment")
                });
            }
            reportSummary = "Treatment Summary Report | Patient filter: '"
                    + report.getPatientName() + "' | Records: " + rows.size();

        } catch (SQLException e) {
            System.err.println("TreatmentReport visitor error: " + e.getMessage());
            reportSummary = "Error generating Treatment Summary: " + e.getMessage();
        }
    }

    @Override
    public void visit(DiagnosticReport report) {
        columns = new String[]{"Patient ID", "Full Name",
            "Diagnosis", "Allergies", "Visit Date"};
        rows.clear();

        String sql = "SELECT mh.patient_id, p.full_name, mh.diagnosis, "
                + "mh.allergies, mh.visit_date "
                + "FROM medical_history mh "
                + "JOIN patients p ON mh.patient_id = p.patient_id "
                + "WHERE (? = '' OR mh.patient_id = ?) "
                + "AND (mh.visit_date BETWEEN ? AND ?) "
                + "ORDER BY mh.visit_date DESC";

        try (PreparedStatement stmt = DBConnection.getInstance()
                .getConnection().prepareStatement(sql)) {

            boolean hasId = !report.getPatientId().isEmpty();
            stmt.setString(1, report.getPatientId());
            stmt.setString(2, hasId ? report.getPatientId() : "0");
            stmt.setString(3, report.getFromDate().isEmpty() ? "2000-01-01" : report.getFromDate());
            stmt.setString(4, report.getToDate().isEmpty() ? "2099-12-31" : report.getToDate());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getInt("patient_id"),
                    rs.getString("full_name"),
                    rs.getString("diagnosis"),
                    rs.getString("allergies"),
                    rs.getString("visit_date")
                });
            }
            reportSummary = "Diagnostic Results Report | Records: " + rows.size();

        } catch (SQLException e) {
            System.err.println("DiagnosticReport visitor error: " + e.getMessage());
            reportSummary = "Error generating Diagnostic Report: " + e.getMessage();
        }
    }

    @Override
    public void visit(FinancialReport report) {
        columns = new String[]{"Patient ID", "Patient Name",
            "Subtotal (Rs.)", "After Tax (Rs.)",
            "Final Amount (Rs.)", "Billed At"};
        rows.clear();

        String sql = "SELECT b.patient_id, b.patient_name, b.subtotal, "
                + "b.after_tax, b.final_amount, b.created_at "
                + "FROM billing b "
                + "WHERE (? = '' OR b.patient_id = ?) "
                + "AND (DATE(b.created_at) BETWEEN ? AND ?) "
                + "ORDER BY b.created_at DESC";

        try (PreparedStatement stmt = DBConnection.getInstance()
                .getConnection().prepareStatement(sql)) {

            stmt.setString(1, report.getPatientId());
            stmt.setString(2, report.getPatientId().isEmpty() ? "0" : report.getPatientId());
            stmt.setString(3, report.getFromDate().isEmpty() ? "2000-01-01" : report.getFromDate());
            stmt.setString(4, report.getToDate().isEmpty() ? "2099-12-31" : report.getToDate());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getInt("patient_id"),
                    rs.getString("patient_name"),
                    String.format("%.2f", rs.getDouble("subtotal")),
                    String.format("%.2f", rs.getDouble("after_tax")),
                    String.format("%.2f", rs.getDouble("final_amount")),
                    rs.getString("created_at")
                });
            }
            reportSummary = "Financial Report | Total records: " + rows.size();

        } catch (SQLException e) {
            System.err.println("FinancialReport visitor error: " + e.getMessage());
            reportSummary = "Error generating Financial Report: " + e.getMessage();
        }
    }
}
