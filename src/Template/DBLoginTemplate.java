package Template;

import Model.User;
import Model.UserDAO;

public class DBLoginTemplate extends LoginTemplate {

    private User authenticatedUser;

    @Override
    protected boolean authenticate(String username, String password) {
        authenticatedUser = UserDAO.authenticate(username, password);
        return authenticatedUser != null;
    }

    @Override
    protected void onLoginSuccess(String username) {
        System.out.println("[GlobeMed] User logged in: " + username
                         + " | Role: " + authenticatedUser.getRole());
    }

    @Override
    protected void onLoginFailure(String username) {
        System.out.println("[GlobeMed] Failed login attempt: " + username);
    }

    public User getAuthenticatedUser() {
        return authenticatedUser;
    }
}