package Flyweight;

public class RolePermission {

    private final String roleName;

    private final boolean canViewRecords;
    private final boolean canEditRecords;
    private final boolean canDeleteRecords;

    private final boolean canPrescribeMeds;
    private final boolean canAccessDiagnostics;
    private final boolean canApproveSurgery;

    private final boolean canManageBilling;
    private final boolean canApproveClaims;
    private final boolean canManageStaff;

    public RolePermission(String roleName,
            boolean canViewRecords, boolean canEditRecords, boolean canDeleteRecords,
            boolean canPrescribeMeds, boolean canAccessDiagnostics, boolean canApproveSurgery,
            boolean canManageBilling, boolean canApproveClaims, boolean canManageStaff) {
        this.roleName = roleName;
        this.canViewRecords = canViewRecords;
        this.canEditRecords = canEditRecords;
        this.canDeleteRecords = canDeleteRecords;
        this.canPrescribeMeds = canPrescribeMeds;
        this.canAccessDiagnostics = canAccessDiagnostics;
        this.canApproveSurgery = canApproveSurgery;
        this.canManageBilling = canManageBilling;
        this.canApproveClaims = canApproveClaims;
        this.canManageStaff = canManageStaff;
    }

    public String getRoleName() {
        return roleName;
    }

    public boolean isCanViewRecords() {
        return canViewRecords;
    }

    public boolean isCanEditRecords() {
        return canEditRecords;
    }

    public boolean isCanDeleteRecords() {
        return canDeleteRecords;
    }

    public boolean isCanPrescribeMeds() {
        return canPrescribeMeds;
    }

    public boolean isCanAccessDiagnostics() {
        return canAccessDiagnostics;
    }

    public boolean isCanApproveSurgery() {
        return canApproveSurgery;
    }

    public boolean isCanManageBilling() {
        return canManageBilling;
    }

    public boolean isCanApproveClaims() {
        return canApproveClaims;
    }

    public boolean isCanManageStaff() {
        return canManageStaff;
    }

    public void displayPermissions() {
        System.out.println("=== Role: " + roleName + " ===");
        System.out.println("  View Records       : " + canViewRecords);
        System.out.println("  Edit Records       : " + canEditRecords);
        System.out.println("  Delete Records     : " + canDeleteRecords);
        System.out.println("  Prescribe Medicine : " + canPrescribeMeds);
        System.out.println("  Access Diagnostics : " + canAccessDiagnostics);
        System.out.println("  Approve Surgery    : " + canApproveSurgery);
        System.out.println("  Manage Billing     : " + canManageBilling);
        System.out.println("  Approve Claims     : " + canApproveClaims);
        System.out.println("  Manage Staff       : " + canManageStaff);
    }
}
