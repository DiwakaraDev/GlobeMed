package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {
    public static int bookAppointment(Appointment a) throws SQLException {
        String sql = "INSERT INTO appointments(patient_id, patient_name, doctor, type, date, time_slot, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, a.getPatientId());
            ps.setString(2, a.getPatientName());
            ps.setString(3, a.getDoctor());
            ps.setString(4, a.getType());
            ps.setDate(5, Date.valueOf(a.getDate()));
            ps.setString(6, a.getTimeSlot());
            ps.setString(7, a.getStatus());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        }
        return -1;
    }

    public static boolean cancelAppointment(int appointmentId) throws SQLException {
        String sql = "DELETE FROM appointments WHERE appointment_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, appointmentId);
            return ps.executeUpdate() > 0;
        }
    }

    public static List<Appointment> getAppointmentsByPatient(int patientId) throws SQLException {
        String sql = "SELECT * FROM appointments WHERE patient_id=?";
        List<Appointment> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Appointment a = new Appointment();
                    a.setAppointmentId(rs.getInt("appointment_id"));
                    a.setPatientId(rs.getInt("patient_id"));
                    a.setPatientName(rs.getString("patient_name"));
                    a.setDoctor(rs.getString("doctor"));
                    a.setType(rs.getString("type"));
                    a.setDate(rs.getDate("date").toLocalDate());
                    a.setTimeSlot(rs.getString("time_slot"));
                    a.setStatus(rs.getString("status"));
                    list.add(a);
                }
            }
        }
        return list;
    }
}
