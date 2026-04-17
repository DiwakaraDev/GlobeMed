package Model;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicalReportDAO {

    public static boolean saveReport(MedicalReport report) {
        String sql = "INSERT INTO medical_reports "
                + "(patient_id, patient_name, report_type, report_content, generated_by) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(sql)) {
            stmt.setInt(1, report.getPatientId());
            stmt.setString(2, report.getPatientName());
            stmt.setString(3, report.getReportType());
            stmt.setString(4, report.getReportContent());
            stmt.setString(5, report.getGeneratedBy());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("MedicalReportDAO error: " + e.getMessage());
            return false;
        }
    }
}
