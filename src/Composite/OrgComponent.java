package Composite;

/**
 * COMPOSITE PATTERN — Component Interface
 * Both leaf (StaffMember) and composite (Department, Hospital)
 * implement this interface — treated uniformly.
 */
public interface OrgComponent {
    String getName();
    String getRole();
    void showDetails(String indent);
}