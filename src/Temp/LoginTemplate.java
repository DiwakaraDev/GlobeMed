package Temp;

public abstract class LoginTemplate {

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

    protected boolean validate(String username, String password) {
        return username != null && !username.isEmpty()
            && password != null && !password.isEmpty();
    }

    protected abstract boolean authenticate(String username, String password);

    protected void onLoginSuccess(String username) {
        System.out.println("Login success: " + username);
    }

    protected void onLoginFailure(String username) {
        System.out.println("Login failed: " + username);
    }
}