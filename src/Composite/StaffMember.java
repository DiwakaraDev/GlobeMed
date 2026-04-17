package Composite;

public class StaffMember implements OrgComponent {

    private String name;
    private String role;
    private String department;

    public StaffMember(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "👤 " + name + " [" + role + "] - " + department);
    }

    public String getDepartment() {
        return department;
    }
}
