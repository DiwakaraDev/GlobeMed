package Model;

import DB.DBConnection;
import java.sql.*;
import java.util.*;

public class AppointmentDAO {

    //BOOK
    public static boolean bookAppointment(int patientId, String doctor,
            String type, String date, String timeSlot) {

        if (patientId <= 0) {
            System.err.println("AppointmentDAO: invalid patientId");
            return false;
        }

        String sql = "INSERT INTO appointments "
                + "(patient_id, doctor, appointment_type, appointment_date, "
                + "time_slot, status) VALUES (?, ?, ?, ?, ?, 'Available')";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ps.setString(2, doctor);
            ps.setString(3, type);
            ps.setString(4, date);
            ps.setString(5, timeSlot);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("AppointmentDAO.book error: " + e.getMessage());
            return false;
        }
    }

    //VIEW ALL FOR PATIENT
    public static List<Map<String, Object>> getAppointments(int patientId) {
        List<Map<String, Object>> list = new ArrayList<>();

        String sql = "SELECT appointment_id, doctor, appointment_date, "
                + "time_slot, status FROM appointments "
                + "WHERE patient_id = ? ORDER BY appointment_date DESC";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Map<String, Object> row = new LinkedHashMap<>();
                row.put("appointment_id", rs.getInt("appointment_id"));
                row.put("doctor", rs.getString("doctor"));
                row.put("appointment_date", rs.getString("appointment_date"));
                row.put("time_slot", rs.getString("time_slot"));
                row.put("status", rs.getString("status"));
                list.add(row);
            }

        } catch (SQLException e) {
            System.err.println("AppointmentDAO.get error: " + e.getMessage());
        }
        return list;
    }

    //CANCEL
    public static boolean cancelAppointment(int appointmentId) {

        if (appointmentId <= 0) {
            return false;
        }

        String sql = "UPDATE appointments SET status = 'Cancelled' "
                + "WHERE appointment_id = ?";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("AppointmentDAO.cancel error: " + e.getMessage());
            return false;
        }
    }

    //GET APPOIMENT
    public static List<Map<String, Object>> getAppointmentsByDoctorAndDate(
            String doctor, String date) {

        List<Map<String, Object>> list = new ArrayList<>();
        String sql = "SELECT time_slot, status FROM appointments "
                + "WHERE doctor = ? AND appointment_date = ?";

        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, doctor);
            ps.setString(2, date);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Map<String, Object> row = new LinkedHashMap<>();
                row.put("time_slot", rs.getString("time_slot"));
                row.put("status", rs.getString("status"));
                list.add(row);
            }
        } catch (SQLException e) {
            System.err.println("getByDoctorAndDate error: " + e.getMessage());
        }
        return list;
    }

    public static boolean restoreAppointmentStatus(int appointmentId, String status) {
        String sql = "UPDATE appointments SET status = ? WHERE appointment_id = ?";
        try (Connection conn = DBConnection.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, status);
            ps.setInt(2, appointmentId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("AppointmentDAO.restore error: " + e.getMessage());
            return false;
        }
    }

    public static int saveAppointment(Appointment appointment) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
