package Visitor;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * VISITOR PATTERN — Concrete Visitor Contains the actual report-generation
 * logic for each report type. The MedicalReport form calls this — it never
 * contains report logic itself.
 */
public class ReportGenerator implements ReportVisitor {

    // Result rows to be shown in the JTable
    private List<Object[]> rows = new ArrayList<>();
    private String[] columns = {};

    public List<Object[]> getRows() {
        return rows;
    }

    public String[] getColumns() {
        return columns;
    }

    // ---- VISIT: Treatment Summary ----
    @Override
    public void visit(TreatmentReport report) {
        columns = new String[]{"Patient Name", "Treatment Plan", "From", "To"};
        rows.clear();
        String sql = "SELECT p.full_name, pr.treatment_plan, pr.created_at "
                + "FROM patient_records pr "
                + "JOIN patients p ON pr.patient_id = p.patient_id "
                + "WHERE p.full_name LIKE ? "
                + "AND DATE(pr.created_at) BETWEEN ? AND ?";
        try (PreparedStatement stmt = DBConnection.getConnection().prepareStatement(sql)) {
            stmt.setString(1, "%" + report.getPatientName() + "%");
            stmt.setString(2, report.getFromDate().isEmpty() ? "2000-01-01" : report.getFromDate());
            stmt.setString(3, report.getToDate().isEmpty() ? "2099-12-31" : report.getToDate());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getString("full_name"),
                    rs.getString("treatment_plan"),
                    report.getFromDate(),
                    report.getToDate()
                });
            }
        } catch (SQLException e) {
            System.err.println("TreatmentReport visitor error: " + e.getMessage());
        }
    }

    // ---- VISIT: Diagnostic Results ----
    @Override
    public void visit(DiagnosticReport report) {
        columns = new String[]{"Patient ID", "Full Name", "Medical History", "Date"};
        rows.clear();
        String sql = "SELECT pr.patient_id, p.full_name, pr.medical_history, pr.created_at "
                + "FROM patient_records pr "
                + "JOIN patients p ON pr.patient_id = p.patient_id "
                + "WHERE pr.patient_id LIKE ? "
                + "AND DATE(pr.created_at) BETWEEN ? AND ?";
        try (PreparedStatement stmt = DBConnection.getConnection().prepareStatement(sql)) {
            stmt.setString(1, "%" + report.getPatientId() + "%");
            stmt.setString(2, report.getFromDate().isEmpty() ? "2000-01-01" : report.getFromDate());
            stmt.setString(3, report.getToDate().isEmpty() ? "2099-12-31" : report.getToDate());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getInt("patient_id"),
                    rs.getString("full_name"),
                    rs.getString("medical_history"),
                    rs.getString("created_at")
                });
            }
        } catch (SQLException e) {
            System.err.println("DiagnosticReport visitor error: " + e.getMessage());
        }
    }

    // ---- VISIT: Financial Report ----
    @Override
    public void visit(FinancialReport report) {
        columns = new String[]{"Patient ID", "Patient Name", "Amount (Rs.)", "Status", "Date"};
        rows.clear();
        String sql = "SELECT b.patient_id, b.patient_name, b.final_amount, 'Billed', b.created_at "
                + "FROM billing b "
                + "WHERE b.patient_id LIKE ? "
                + "AND DATE(b.created_at) BETWEEN ? AND ?";
        try (PreparedStatement stmt = DBConnection.getConnection().prepareStatement(sql)) {
            stmt.setString(1, "%" + report.getPatientId() + "%");
            stmt.setString(2, report.getFromDate().isEmpty() ? "2000-01-01" : report.getFromDate());
            stmt.setString(3, report.getToDate().isEmpty() ? "2099-12-31" : report.getToDate());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                rows.add(new Object[]{
                    rs.getInt("patient_id"),
                    rs.getString("patient_name"),
                    rs.getDouble("final_amount"),
                    "Billed",
                    rs.getString("created_at")
                });
            }
        } catch (SQLException e) {
            System.err.println("FinancialReport visitor error: " + e.getMessage());
        }
    }
}
