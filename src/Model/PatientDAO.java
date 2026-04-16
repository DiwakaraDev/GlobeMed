package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    public static int createPatient(Patient p) throws SQLException {
        String sql = "INSERT INTO patients (full_name, dob, gender, contact, address)VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, p.getFullName());
            if (p.getDob() != null) {
                ps.setDate(2, Date.valueOf(p.getDob()));
            } else {
                ps.setNull(2, Types.DATE);
            }
            ps.setString(3, p.getGender());
            ps.setString(4, p.getContact());
            ps.setString(5, p.getAddress());

            int affected = ps.executeUpdate();
            if (affected == 0) {
                throw new SQLException("Creating patient failed, no rows affected.");
            }

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1;
    }

    public static boolean updatePatient(Patient p) throws SQLException {
        String sql = "UPDATE patients SET full_name=?, dob=?, gender=?, contact=?, address=? WHERE patient_id=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getFullName());
            if (p.getDob() != null) {
                ps.setDate(2, Date.valueOf(p.getDob()));
            } else {
                ps.setNull(2, Types.DATE);
            }
            ps.setString(3, p.getGender());
            ps.setString(4, p.getContact());
            ps.setString(5, p.getAddress());
            ps.setInt(6, p.getPatientId());

            return ps.executeUpdate() > 0;
        }
    }

    public static int getPatientIdByName(String name) throws SQLException {
        String sql = "SELECT patient_id FROM patient WHERE full_name=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("patient_id");
                }
            }
        }
        return 0;
    }

    public static Patient getPatientById(int id) throws SQLException {
        String sql = "SELECT * FROM patients WHERE patient_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Patient p = new Patient();
                    p.setPatientId(rs.getInt("patient_id"));
                    p.setFullName(rs.getString("full_name"));
                    Date d = rs.getDate("dob");
                    if (d != null) {
                        p.setDob(d.toLocalDate());
                    }
                    p.setGender(rs.getString("gender"));
                    p.setContact(rs.getString("contact"));
                    p.setAddress(rs.getString("address"));
                    return p;
                }
            }
        }
        return null;
    }

    public static List<Patient> searchPatients(String term) throws SQLException {
        String sql = "SELECT * FROM patients WHERE full_name LIKE ? OR patient_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + term + "%");
            int id = -1;
            try {
                id = Integer.parseInt(term);
            } catch (NumberFormatException ex) {
            }
            if (id > 0) {
                ps.setInt(2, id);
            } else {
                ps.setNull(2, Types.INTEGER);
            }

            List<Patient> list = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Patient p = new Patient();
                    p.setPatientId(rs.getInt("patient_id"));
                    p.setFullName(rs.getString("full_name"));
                    Date d = rs.getDate("dob");
                    if (d != null) {
                        p.setDob(d.toLocalDate());
                    }
                    p.setGender(rs.getString("gender"));
                    p.setContact(rs.getString("contact"));
                    p.setAddress(rs.getString("address"));
                    list.add(p);
                }
            }
            return list;
        }
    }
}
