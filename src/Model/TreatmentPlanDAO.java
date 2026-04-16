package Model;

import java.sql.*;
import java.time.LocalDate;
public class TreatmentPlanDAO {
    
    public static int savePlan(int patientId, String doctor, String prescription, LocalDate nextAppointment, String instructions) throws SQLException {
        String sql = "INSERT INTO treatment_plans (patient_id, doctor_assigned, prescription, next_appointment, special_instructions)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, patientId);
            ps.setString(2, doctor);
            ps.setString(3, prescription);
            if (nextAppointment != null) ps.setDate(4, Date.valueOf(nextAppointment));
            else ps.setNull(4, Types.DATE);
            ps.setString(5, instructions);

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        }
        return -1;
    }
    
}
