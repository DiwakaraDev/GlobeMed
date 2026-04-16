package Model;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MedicalHistoryDAO {
    
    public static int addRecord(int patientId, LocalDate visitDate, String diagnosis, String allergies, String previousTreatment, String notes) throws SQLException {
        String sql = "INSERT INTO medical_history (history_id, patient_id, date_of_visit, condition_diagnosis, allergies, previous_treatment, notes, created_at)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, patientId);
            if (visitDate != null) ps.setDate(2, Date.valueOf(visitDate));
            else ps.setNull(2, Types.DATE);
            ps.setString(3, diagnosis);
            ps.setString(4, allergies);
            ps.setString(5, previousTreatment);
            ps.setString(6, notes);

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        }
        return -1;
    }

    public static List<Map<String, Object>> getHistoryForPatient(int patientId) throws SQLException {
        String sql = "SELECT history_id, patient_id, date_of_visit, condition_diagnosis, allergies, previous_treatment, notes FROM medical_history WHERE patient_id = ? ORDER BY date_of_visit DESC";
        List<Map<String, Object>> rows = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> row = new HashMap<>();
                    row.put("patient_id", rs.getInt("patient_id"));
                    Date d = rs.getDate("date_of_visit");
                    row.put("date_of_visit", d != null ? d.toLocalDate().toString() : "");
                    row.put("condition_diagnosis", rs.getString("condition_diagnosis"));
                    row.put("allergies", rs.getString("allergies"));
                    row.put("previous_treatment", rs.getString("previous_treatment"));
                    row.put("notes", rs.getString("notes"));
                    rows.add(row);
                }
            }
        }
        return rows;
    }
    
}
