package Model;

public class Staff {
    private int staffId;
    private String staffName;
    private String role;
    private String department;

    public Staff() {}

    public int getStaffId()         { return staffId; }
    public String getStaffName()    { return staffName; }
    public String getRole()         { return role; }
    public String getDepartment()   { return department; }

    public void setStaffId(int staffId)         { this.staffId = staffId; }
    public void setStaffName(String staffName)  { this.staffName = staffName; }
    public void setRole(String role)            { this.role = role; }
    public void setDepartment(String dept)      { this.department = dept; }
}