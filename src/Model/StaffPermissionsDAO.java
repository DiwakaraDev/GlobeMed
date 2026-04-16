package Model;

import java.sql.*;

public class StaffPermissionsDAO {
    
    public static boolean savePermissions(StaffPermissions perm) throws SQLException {
        
        try (Connection conn = DBConnection.getConnection()) {

        String checkSql = "SELECT staff_id FROM staff WHERE staff_id=?";
        try (PreparedStatement psCheck = conn.prepareStatement(checkSql)) {
            psCheck.setInt(1, perm.getStaffId());
            try (ResultSet rs = psCheck.executeQuery()) {
                if (!rs.next()) {
                    throw new SQLException("Staff ID " + perm.getStaffId() + " does not exist.");
                }
            }
        }
        
        String sql = "INSERT INTO staff_permissions(staff_id, view_records, edit_records, delete_records, prescribe_meds, access_diagnostics, approve_surgery, manage_billing, approve_claims, manage_staff) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" +
                     "ON DUPLICATE KEY UPDATE view_records=?, edit_records=?, delete_records=?, prescribe_meds=?, access_diagnostics=?, approve_surgery=?, manage_billing=?, approve_claims=?, manage_staff=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, perm.getStaffId());
            ps.setBoolean(2, perm.isViewRecords());
            ps.setBoolean(3, perm.isEditRecords());
            ps.setBoolean(4, perm.isDeleteRecords());
            ps.setBoolean(5, perm.isPrescribeMeds());
            ps.setBoolean(6, perm.isAccessDiagnostics());
            ps.setBoolean(7, perm.isApproveSurgery());
            ps.setBoolean(8, perm.isManageBilling());
            ps.setBoolean(9, perm.isApproveClaims());
            ps.setBoolean(10, perm.isManageStaff());

            ps.setBoolean(11, perm.isViewRecords());
            ps.setBoolean(12, perm.isEditRecords());
            ps.setBoolean(13, perm.isDeleteRecords());
            ps.setBoolean(14, perm.isPrescribeMeds());
            ps.setBoolean(15, perm.isAccessDiagnostics());
            ps.setBoolean(16, perm.isApproveSurgery());
            ps.setBoolean(17, perm.isManageBilling());
            ps.setBoolean(18, perm.isApproveClaims());
            ps.setBoolean(19, perm.isManageStaff());

            return ps.executeUpdate() > 0;
        }
        }
    }
}
