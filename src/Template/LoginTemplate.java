package Template;

// TEMPLATE METHOD PATTERN
// Defines the login skeleton. Subclasses override individual steps.
public abstract class LoginTemplate {

    // ---- TEMPLATE METHOD — final, cannot be overridden ----
    public final boolean login(String username, String password) {
        if (!validate(username, password)) {
            return false;
        }
        boolean success = authenticate(username, password);
        if (success) {
            onLoginSuccess(username);
        } else {
            onLoginFailure(username);
        }
        return success;
    }

    // Step 1: Validate inputs (common for all login types)
    protected boolean validate(String username, String password) {
        return username != null && !username.isEmpty()
            && password != null && !password.isEmpty();
    }

    // Step 2: Authenticate — each subclass implements differently
    protected abstract boolean authenticate(String username, String password);

    // Step 3: Hook methods — optional to override
    protected void onLoginSuccess(String username) {
        System.out.println("Login success: " + username);
    }

    protected void onLoginFailure(String username) {
        System.out.println("Login failed: " + username);
    }
}