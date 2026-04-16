package Model;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReportDAO {
    public static List<ReportEntry> generateReport(String reportType, LocalDate fromDate, LocalDate toDate, int patientId) throws SQLException {
        List<ReportEntry> report = new ArrayList<>();
        String sql = "";

        switch (reportType) {
            case "Treatment Summary":
                sql = "SELECT date, prescription AS details, doctor, amount FROM treatment WHERE date BETWEEN ? AND ?";
                if (patientId != 0) sql += " AND patient_id=?";
                break;
            case "Diagnostic Results":
                sql = "SELECT date, test_name AS details, doctor, amount FROM diagnostic WHERE date BETWEEN ? AND ?";
                if (patientId != 0) sql += " AND patient_id=?";
                break;
            case "Financial Report":
                sql = "SELECT date, description AS details, '' AS doctor, amount FROM payment WHERE date BETWEEN ? AND ?";
                if (patientId != 0) sql += " AND patient_id=?";
                break;
        }

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDate(1, Date.valueOf(fromDate));
            ps.setDate(2, Date.valueOf(toDate));
            if (patientId != 0) ps.setInt(3, patientId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    ReportEntry entry = new ReportEntry();
                    entry.setDate(rs.getDate("date").toLocalDate());
                    entry.setDetails(rs.getString("details"));
                    entry.setDoctor(rs.getString("doctor"));
                    entry.setAmount(rs.getDouble("amount"));
                    report.add(entry);
                }
            }
        }

        return report;
    }
}
