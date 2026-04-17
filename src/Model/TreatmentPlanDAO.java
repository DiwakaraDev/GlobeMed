package Model;

import DB.DBConnection;
import java.sql.*;
import java.util.*;

public class TreatmentPlanDAO {

    public static boolean savePlan(int patientId, String doctor,
            String prescription, String nextAppt, String instructions) {

        if (patientId <= 0) {
            System.err.println("TreatmentPlanDAO: invalid patientId = " + patientId);
            return false;
        }

        String sql = "INSERT INTO treatment_plans "
                + "(patient_id, doctor_assigned, prescription, "
                + "next_appointment, special_instructions) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ps.setString(2, doctor);
            ps.setString(3, prescription);
            ps.setString(4, nextAppt.isEmpty() ? null : nextAppt);
            ps.setString(5, instructions.isEmpty() ? null : instructions);

            int rows = ps.executeUpdate();
            System.out.println("TreatmentPlanDAO.save: inserted " + rows
                    + " row(s) for patient " + patientId);
            return rows > 0;

        } catch (SQLException e) {
            System.err.println("TreatmentPlanDAO.save error: " + e.getMessage());
            return false;
        }
    }

    public static Map<String, Object> getLatestPlan(int patientId) {
        Map<String, Object> plan = new LinkedHashMap<>();

        String sql = "SELECT plan_id, doctor_assigned, prescription, "
                + "next_appointment, special_instructions "
                + "FROM treatment_plans WHERE patient_id = ? "
                + "ORDER BY created_at DESC LIMIT 1";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                plan.put("plan_id", rs.getInt("plan_id"));
                plan.put("doctor_assigned", rs.getString("doctor_assigned"));
                plan.put("prescription", rs.getString("prescription"));
                plan.put("next_appointment", rs.getString("next_appointment"));
                plan.put("special_instructions", rs.getString("special_instructions"));
            }

        } catch (SQLException e) {
            System.err.println("TreatmentPlanDAO.getLatest error: " + e.getMessage());
        }
        return plan;
    }

    public static boolean updatePlan(int planId, String doctor,
            String prescription, String nextAppt, String instructions) {

        if (planId <= 0) {
            return false;
        }

        String sql = "UPDATE treatment_plans SET doctor_assigned=?, "
                + "prescription=?, next_appointment=?, "
                + "special_instructions=? WHERE plan_id=?";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, doctor);
            ps.setString(2, prescription);
            ps.setString(3, nextAppt.isEmpty() ? null : nextAppt);
            ps.setString(4, instructions.isEmpty() ? null : instructions);
            ps.setInt(5, planId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("TreatmentPlanDAO.update error: " + e.getMessage());
            return false;
        }
    }

    public static boolean deletePlan(int planId) {

        if (planId <= 0) {
            return false;
        }

        String sql = "DELETE FROM treatment_plans WHERE plan_id=?";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, planId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("TreatmentPlanDAO.delete error: " + e.getMessage());
            return false;
        }
    }
}
