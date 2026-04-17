package Model;

import DB.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaffPermissionsDAO {

    public static boolean savePermissions(StaffPermissions p) {
        // Upsert: insert or update if staff_id already exists
        String sql = "INSERT INTO staff_permissions "
                   + "(staff_id, view_records, edit_records, delete_records, "
                   + "prescribe_meds, access_diagnostics, approve_surgery, "
                   + "manage_billing, approve_claims, manage_staff) "
                   + "VALUES (?,?,?,?,?,?,?,?,?,?) "
                   + "ON DUPLICATE KEY UPDATE "
                   + "view_records=?, edit_records=?, delete_records=?, "
                   + "prescribe_meds=?, access_diagnostics=?, approve_surgery=?, "
                   + "manage_billing=?, approve_claims=?, manage_staff=?";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(sql)) {
            // INSERT values
            stmt.setInt(1,     p.getStaffId());
            stmt.setBoolean(2, p.isViewRecords());
            stmt.setBoolean(3, p.isEditRecords());
            stmt.setBoolean(4, p.isDeleteRecords());
            stmt.setBoolean(5, p.isPrescribeMeds());
            stmt.setBoolean(6, p.isAccessDiagnostics());
            stmt.setBoolean(7, p.isApproveSurgery());
            stmt.setBoolean(8, p.isManageBilling());
            stmt.setBoolean(9, p.isApproveClaims());
            stmt.setBoolean(10, p.isManageStaff());
            // ON DUPLICATE KEY UPDATE values
            stmt.setBoolean(11, p.isViewRecords());
            stmt.setBoolean(12, p.isEditRecords());
            stmt.setBoolean(13, p.isDeleteRecords());
            stmt.setBoolean(14, p.isPrescribeMeds());
            stmt.setBoolean(15, p.isAccessDiagnostics());
            stmt.setBoolean(16, p.isApproveSurgery());
            stmt.setBoolean(17, p.isManageBilling());
            stmt.setBoolean(18, p.isApproveClaims());
            stmt.setBoolean(19, p.isManageStaff());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("StaffPermissionsDAO error: " + e.getMessage());
            return false;
        }
    }
}