package Model;

import DB.DBConnection;
import java.sql.*;
import java.util.*;

public class MedicalHistoryDAO {

    // ── CREATE ──────────────────────────────────────────────────────────────
    public static boolean addHistory(int patientId, String diagnosis,
            String allergies, String notes) {

        // Guard: reject invalid patient_id before hitting DB
        if (patientId <= 0) {
            System.err.println("MedicalHistoryDAO.add error: invalid patientId = " + patientId);
            return false;
        }

        // Guard: check patient actually exists in patients table
        if (!patientExists(patientId)) {
            System.err.println("MedicalHistoryDAO.add error: patient_id "
                    + patientId + " does not exist in patients table.");
            return false;
        }

        String sql = "INSERT INTO medical_history "
                + "(patient_id, visit_date, diagnosis, allergies, previous_treatment) "
                + "VALUES (?, CURDATE(), ?, ?, ?)";

        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ps.setString(2, diagnosis != null ? diagnosis : "");
            ps.setString(3, allergies != null ? allergies : "");
            ps.setString(4, notes != null ? notes : "");

            int rows = ps.executeUpdate();
            System.out.println("MedicalHistoryDAO.add: inserted " + rows + " row(s) for patient " + patientId);
            return rows > 0;

        } catch (SQLException e) {
            System.err.println("MedicalHistoryDAO.add error: " + e.getMessage());
            return false;
        }
    }

    // ── READ — all history for one patient ──────────────────────────────────
    public static List<Map<String, Object>> getHistoryForPatient(int patientId) {
        List<Map<String, Object>> rows = new ArrayList<>();

        if (patientId <= 0) return rows;

        String sql = "SELECT history_id, visit_date, diagnosis, allergies, previous_treatment "
                + "FROM medical_history WHERE patient_id = ? ORDER BY visit_date DESC";

        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Map<String, Object> row = new LinkedHashMap<>();
                row.put("history_id",         rs.getInt("history_id"));
                row.put("visit_date",          rs.getString("visit_date"));
                row.put("diagnosis",           rs.getString("diagnosis"));
                row.put("allergies",           rs.getString("allergies"));
                row.put("previous_treatment",  rs.getString("previous_treatment"));
                rows.add(row);
            }

        } catch (SQLException e) {
            System.err.println("MedicalHistoryDAO.get error: " + e.getMessage());
        }
        return rows;
    }

    // ── UPDATE ──────────────────────────────────────────────────────────────
    public static boolean updateHistory(int historyId, String diagnosis,
            String allergies, String notes) {

        if (historyId <= 0) return false;

        String sql = "UPDATE medical_history SET diagnosis = ?, allergies = ?, "
                + "previous_treatment = ? WHERE history_id = ?";

        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, diagnosis != null ? diagnosis : "");
            ps.setString(2, allergies != null ? allergies : "");
            ps.setString(3, notes != null ? notes : "");
            ps.setInt(4, historyId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("MedicalHistoryDAO.update error: " + e.getMessage());
            return false;
        }
    }

    // ── DELETE ──────────────────────────────────────────────────────────────
    public static boolean deleteHistory(int historyId) {

        if (historyId <= 0) return false;

        String sql = "DELETE FROM medical_history WHERE history_id = ?";

        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, historyId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("MedicalHistoryDAO.delete error: " + e.getMessage());
            return false;
        }
    }

    // ── HELPER — verify patient exists ──────────────────────────────────────
    private static boolean patientExists(int patientId) {
        String sql = "SELECT 1 FROM patients WHERE patient_id = ?";
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.err.println("MedicalHistoryDAO.patientExists error: " + e.getMessage());
            return false;
        }
    }
}