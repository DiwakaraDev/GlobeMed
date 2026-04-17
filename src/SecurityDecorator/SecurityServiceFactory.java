package SecurityDecorator;

public class SecurityServiceFactory {

    public static DataService createSecureService(String username, boolean isAuthenticated) {

        DataService base = new BasicDataService();
        DataService encrypt = new EncryptionDecorator(base);
        DataService logged = new AccessLoggingDecorator(encrypt, username);
        DataService authed = new AuthenticationDecorator(logged, username, isAuthenticated);

        System.out.println("Security stack: " + authed.getServiceDescription());
        return authed;
    }
}
