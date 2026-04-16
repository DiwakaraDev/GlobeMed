package Model;

import java.sql.*;

public class StaffDAO {
    public static int addStaff(Staff staff) throws SQLException {
        String sql = "INSERT INTO staff(staff_name, role, department)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, staff.getStaffName());
            ps.setString(2, staff.getRole());
            ps.setString(3, staff.getDepartment());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
        }
        return -1;
    }

    public static boolean updateStaff(Staff staff) throws SQLException {
        String sql = "UPDATE staff SET role=?, department=? WHERE staff_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, staff.getRole());
            ps.setString(2, staff.getDepartment());
            ps.setInt(3, staff.getStaffId());
            return ps.executeUpdate() > 0;
        }
    }
}
