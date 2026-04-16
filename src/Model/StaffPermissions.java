package Model;

public class StaffPermissions {
    private int staffId;
    private boolean viewRecords;
    private boolean editRecords;
    private boolean deleteRecords;
    private boolean prescribeMeds;
    private boolean accessDiagnostics;
    private boolean approveSurgery;
    private boolean manageBilling;
    private boolean approveClaims;
    private boolean manageStaff;

    public StaffPermissions() {}

    public int getStaffId() { return staffId; }
    public void setStaffId(int staffId) { this.staffId = staffId; }

    public boolean isViewRecords() { return viewRecords; }
    public void setViewRecords(boolean viewRecords) { this.viewRecords = viewRecords; }

    public boolean isEditRecords() { return editRecords; }
    public void setEditRecords(boolean editRecords) { this.editRecords = editRecords; }

    public boolean isDeleteRecords() { return deleteRecords; }
    public void setDeleteRecords(boolean deleteRecords) { this.deleteRecords = deleteRecords; }

    public boolean isPrescribeMeds() { return prescribeMeds; }
    public void setPrescribeMeds(boolean prescribeMeds) { this.prescribeMeds = prescribeMeds; }

    public boolean isAccessDiagnostics() { return accessDiagnostics; }
    public void setAccessDiagnostics(boolean accessDiagnostics) { this.accessDiagnostics = accessDiagnostics; }

    public boolean isApproveSurgery() { return approveSurgery; }
    public void setApproveSurgery(boolean approveSurgery) { this.approveSurgery = approveSurgery; }

    public boolean isManageBilling() { return manageBilling; }
    public void setManageBilling(boolean manageBilling) { this.manageBilling = manageBilling; }

    public boolean isApproveClaims() { return approveClaims; }
    public void setApproveClaims(boolean approveClaims) { this.approveClaims = approveClaims; }

    public boolean isManageStaff() { return manageStaff; }
    public void setManageStaff(boolean manageStaff) { this.manageStaff = manageStaff; }
}
