package Model;

public class StaffPermissions {
    private int staffId;
    private boolean viewRecords, editRecords, deleteRecords;
    private boolean prescribeMeds, accessDiagnostics, approveSurgery;
    private boolean manageBilling, approveClaims, manageStaff;

    public int getStaffId()               { return staffId; }
    public boolean isViewRecords()        { return viewRecords; }
    public boolean isEditRecords()        { return editRecords; }
    public boolean isDeleteRecords()      { return deleteRecords; }
    public boolean isPrescribeMeds()      { return prescribeMeds; }
    public boolean isAccessDiagnostics()  { return accessDiagnostics; }
    public boolean isApproveSurgery()     { return approveSurgery; }
    public boolean isManageBilling()      { return manageBilling; }
    public boolean isApproveClaims()      { return approveClaims; }
    public boolean isManageStaff()        { return manageStaff; }

    public void setStaffId(int v)              { this.staffId = v; }
    public void setViewRecords(boolean v)      { this.viewRecords = v; }
    public void setEditRecords(boolean v)      { this.editRecords = v; }
    public void setDeleteRecords(boolean v)    { this.deleteRecords = v; }
    public void setPrescribeMeds(boolean v)    { this.prescribeMeds = v; }
    public void setAccessDiagnostics(boolean v){ this.accessDiagnostics = v; }
    public void setApproveSurgery(boolean v)   { this.approveSurgery = v; }
    public void setManageBilling(boolean v)    { this.manageBilling = v; }
    public void setApproveClaims(boolean v)    { this.approveClaims = v; }
    public void setManageStaff(boolean v)      { this.manageStaff = v; }
}