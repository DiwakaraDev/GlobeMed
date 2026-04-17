package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RolePermissionFactory {

    private static final Map<String, RolePermission> permissionPool = new HashMap<>();

    static {

        permissionPool.put("Doctor", new RolePermission(
            "Doctor",
            true,  true,  false,   // General: view, edit, NO delete
            true,  true,  true,    // Medical: prescribe, diagnostics, surgery
            false, false, false    // Admin: none
        ));

        permissionPool.put("Nurse", new RolePermission(
            "Nurse",
            true,  true,  false,   // General: view, edit, NO delete
            false, true,  false,   // Medical: no prescribe, diagnostics only
            false, false, false    // Admin: none
        ));

        permissionPool.put("Pharmacist", new RolePermission(
            "Pharmacist",
            true,  false, false,   // General: view only
            true,  false, false,   // Medical: prescribe only (dispense)
            false, false, false    // Admin: none
        ));

        permissionPool.put("Administrator", new RolePermission(
            "Administrator",
            true,  true,  true,    // General: full access
            false, false, false,   // Medical: none
            true,  true,  true     // Admin: full access
        ));

        permissionPool.put("Receptionist", new RolePermission(
            "Receptionist",
            true,  false, false,   // General: view only
            false, false, false,   // Medical: none
            false, false, false    // Admin: none
        ));
    }

    public static RolePermission getPermission(String roleName) {
        if (!permissionPool.containsKey(roleName)) {
            throw new IllegalArgumentException(
                "Unknown role: '" + roleName + "'. Valid roles: "
                + permissionPool.keySet());
        }
        System.out.println("Flyweight: Returning shared permission for role: " + roleName);
        return permissionPool.get(roleName);
    }

    public static void registerRole(String roleName, RolePermission permission) {
        permissionPool.putIfAbsent(roleName, permission);
    }

    public static void listAllRoles() {
        System.out.println("Available roles: " + permissionPool.keySet());
    }
}
