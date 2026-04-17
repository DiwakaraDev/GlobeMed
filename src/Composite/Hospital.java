package Composite;

import java.util.ArrayList;
import java.util.List;

public class Hospital implements OrgComponent {

    private String name;
    private List<OrgComponent> departments = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDepartment(OrgComponent dept) {
        departments.add(dept);
    }

    public List<OrgComponent> getDepartments() {
        return departments;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Hospital";
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "🏨 Hospital: " + name);
        for (OrgComponent dept : departments) {
            dept.showDetails(indent + "   ");
        }
    }
}
