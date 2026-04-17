package SecurityDecorator;

public class AuthenticationDecorator extends DataServiceDecorator {

    private final String currentUser;
    private final boolean isAuthenticated;

    public AuthenticationDecorator(DataService service,
            String currentUser,
            boolean isAuthenticated) {
        super(service);
        this.currentUser = currentUser;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public String readData(String key) {
        checkAuth();
        return wrappedService.readData(key);
    }

    @Override
    public void writeData(String key, String value) {
        checkAuth();
        wrappedService.writeData(key, value);
    }

    @Override
    public String getServiceDescription() {
        return wrappedService.getServiceDescription() + " + AuthenticationLayer";
    }

    private void checkAuth() {
        if (!isAuthenticated) {
            throw new SecurityException(
                    "Authentication failed: User '" + currentUser
                    + "' is not authenticated.");
        }
        System.out.println("[AUTH] User '" + currentUser + "' authenticated ✅");
    }
}
