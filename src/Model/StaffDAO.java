package Model;

import DB.DBConnection;
import java.sql.*;
import java.util.*;

public class StaffDAO {

    // ── GET BY STAFF ID ─────────────────────────────────────────────────────
    public static Map<String, Object> getStaffById(String staffId) {
        Map<String, Object> staff = new LinkedHashMap<>();
        String sql = "SELECT * FROM staff WHERE staff_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, staffId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                staff.put("staff_id",   rs.getString("staff_id"));
                staff.put("staff_name", rs.getString("staff_name"));
                staff.put("role",       rs.getString("role"));
                staff.put("department", rs.getString("department"));
                // permissions
                staff.put("perm_general_view",   rs.getBoolean("perm_general_view"));
                staff.put("perm_general_edit",   rs.getBoolean("perm_general_edit"));
                staff.put("perm_general_delete", rs.getBoolean("perm_general_delete"));
                staff.put("perm_medical_view",   rs.getBoolean("perm_medical_view"));
                staff.put("perm_medical_edit",   rs.getBoolean("perm_medical_edit"));
                staff.put("perm_medical_delete", rs.getBoolean("perm_medical_delete"));
                staff.put("perm_admin_view",     rs.getBoolean("perm_admin_view"));
                staff.put("perm_admin_edit",     rs.getBoolean("perm_admin_edit"));
                staff.put("perm_admin_delete",   rs.getBoolean("perm_admin_delete"));
            }

        } catch (SQLException e) {
            System.err.println("StaffDAO.getById error: " + e.getMessage());
        }
        return staff;
    }

    // ── INSERT ───────────────────────────────────────────────────────────────
    public static boolean insertStaff(String staffId, String name,
            String role, String department,
            boolean gView, boolean gEdit, boolean gDelete,
            boolean mView, boolean mEdit, boolean mDelete,
            boolean aView, boolean aEdit, boolean aDelete) {

        String sql = "INSERT INTO staff (staff_id, staff_name, role, department, "
                + "perm_general_view, perm_general_edit, perm_general_delete, "
                + "perm_medical_view, perm_medical_edit, perm_medical_delete, "
                + "perm_admin_view, perm_admin_edit, perm_admin_delete) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, staffId);
            ps.setString(2, name);
            ps.setString(3, role);
            ps.setString(4, department);
            ps.setBoolean(5,  gView);   ps.setBoolean(6,  gEdit);   ps.setBoolean(7,  gDelete);
            ps.setBoolean(8,  mView);   ps.setBoolean(9,  mEdit);   ps.setBoolean(10, mDelete);
            ps.setBoolean(11, aView);   ps.setBoolean(12, aEdit);   ps.setBoolean(13, aDelete);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("StaffDAO.insert error: " + e.getMessage());
            return false;
        }
    }

    // ── UPDATE ───────────────────────────────────────────────────────────────
    public static boolean updateStaff(String staffId, String name,
            String role, String department,
            boolean gView, boolean gEdit, boolean gDelete,
            boolean mView, boolean mEdit, boolean mDelete,
            boolean aView, boolean aEdit, boolean aDelete) {

        String sql = "UPDATE staff SET staff_name=?, role=?, department=?, "
                + "perm_general_view=?, perm_general_edit=?, perm_general_delete=?, "
                + "perm_medical_view=?, perm_medical_edit=?, perm_medical_delete=?, "
                + "perm_admin_view=?, perm_admin_edit=?, perm_admin_delete=? "
                + "WHERE staff_id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, role);
            ps.setString(3, department);
            ps.setBoolean(4,  gView);   ps.setBoolean(5,  gEdit);   ps.setBoolean(6,  gDelete);
            ps.setBoolean(7,  mView);   ps.setBoolean(8,  mEdit);   ps.setBoolean(9,  mDelete);
            ps.setBoolean(10, aView);   ps.setBoolean(11, aEdit);   ps.setBoolean(12, aDelete);
            ps.setString(13, staffId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("StaffDAO.update error: " + e.getMessage());
            return false;
        }
    }
}