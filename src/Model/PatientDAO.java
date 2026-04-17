package Model;

import DB.DBConnection;
import java.sql.*;

public class PatientDAO {

    public static int createPatient(Patient p) {
        String sql = "INSERT INTO patients (full_name, dob, gender, phone, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection()
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, p.getFullName());
            stmt.setDate(2, p.getDob() != null ? Date.valueOf(p.getDob()) : null);
            stmt.setString(3, p.getGender());
            stmt.setString(4, p.getContact());
            stmt.setString(5, p.getAddress());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.err.println("PatientDAO.create error: " + e.getMessage());
        }
        return -1;
    }

    public static boolean updatePatient(Patient p) {
        String sql = "UPDATE patients SET full_name=?, dob=?, gender=?, phone=?, email=? WHERE patient_id=?";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(sql)) {
            stmt.setString(1, p.getFullName());
            stmt.setDate(2, p.getDob() != null ? Date.valueOf(p.getDob()) : null);
            stmt.setString(3, p.getGender());
            stmt.setString(4, p.getContact());
            stmt.setString(5, p.getAddress());
            stmt.setInt(6, p.getPatientId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("PatientDAO.update error: " + e.getMessage());
            return false;
        }
    }

    public static Model.Patient getPatientById(int patientId) {
        String sql = "SELECT * FROM patients WHERE patient_id = ?";
        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Builder.PatientBuilder()
                        .setFullName(rs.getString("full_name"))
                        .setGender(rs.getString("gender"))
                        .setContact(rs.getString("phone"))
                        .build();
            }
        } catch (SQLException e) {
            System.err.println("PatientDAO.getById error: " + e.getMessage());
        }
        return null;
    }
}
