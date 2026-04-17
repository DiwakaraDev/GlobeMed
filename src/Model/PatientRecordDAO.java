package Model;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientRecordDAO {

    public static int saveRecord(PatientRecord record) {
        String sql = "INSERT INTO patient_records "
                + "(patient_id, full_name, dob, gender, blood_type, allergies, "
                + "medical_history, treatment_plan) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection()
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, record.getPatientId());
            stmt.setString(2, record.getFullName());
            stmt.setString(3, record.getDob());
            stmt.setString(4, record.getGender());
            stmt.setString(5, record.getBloodType());
            stmt.setString(6, record.getAllergies());
            stmt.setString(7, record.getMedicalHistory());
            stmt.setString(8, record.getTreatmentPlan());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.err.println("PatientRecordDAO.save error: " + e.getMessage());
        }
        return -1;
    }

    public static List<PatientRecord> getAllRecords() {
        List<PatientRecord> list = new ArrayList<>();
        String sql = "SELECT * FROM patient_records ORDER BY created_at DESC";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                PatientRecord r = new PatientRecord();
                r.setRecordId(rs.getInt("record_id"));
                r.setPatientId(rs.getInt("patient_id"));
                r.setFullName(rs.getString("full_name"));
                r.setDob(rs.getString("dob"));
                r.setGender(rs.getString("gender"));
                r.setBloodType(rs.getString("blood_type"));
                r.setAllergies(rs.getString("allergies"));
                r.setMedicalHistory(rs.getString("medical_history"));
                r.setTreatmentPlan(rs.getString("treatment_plan"));
                list.add(r);
            }
        } catch (SQLException e) {
            System.err.println("PatientRecordDAO.getAll error: " + e.getMessage());
        }
        return list;
    }
}
