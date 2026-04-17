package Composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrgComponent {

    private String name;
    private List<OrgComponent> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addMember(OrgComponent member) {
        members.add(member);
    }

    public void removeMember(OrgComponent member) {
        members.remove(member);
    }

    public List<OrgComponent> getMembers() {
        return members;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Department";
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "🏥 Department: " + name);
        for (OrgComponent member : members) {
            member.showDetails(indent + "   ");
        }
    }
}
