package Flyweight;

public class StaffMemberWithRole {

    private final String staffId;
    private final String staffName;
    private final String department;

    private final RolePermission rolePermission;

    public StaffMemberWithRole(String staffId, String staffName,
            String department, String roleName) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.department = department;

        this.rolePermission = RolePermissionFactory.getPermission(roleName);
    }

    public boolean canPerform(String action) {
        switch (action) {
            case "VIEW_RECORDS":
                return rolePermission.isCanViewRecords();
            case "EDIT_RECORDS":
                return rolePermission.isCanEditRecords();
            case "DELETE_RECORDS":
                return rolePermission.isCanDeleteRecords();
            case "PRESCRIBE_MEDS":
                return rolePermission.isCanPrescribeMeds();
            case "ACCESS_DIAGNOSTICS":
                return rolePermission.isCanAccessDiagnostics();
            case "APPROVE_SURGERY":
                return rolePermission.isCanApproveSurgery();
            case "MANAGE_BILLING":
                return rolePermission.isCanManageBilling();
            case "APPROVE_CLAIMS":
                return rolePermission.isCanApproveClaims();
            case "MANAGE_STAFF":
                return rolePermission.isCanManageStaff();
            default:
                return false;
        }
    }

    // Getters
    public String getStaffId() {
        return staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getDepartment() {
        return department;
    }

    public RolePermission getRole() {
        return rolePermission;
    }
}
