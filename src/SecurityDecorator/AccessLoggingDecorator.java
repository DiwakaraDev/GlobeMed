package SecurityDecorator;

import java.time.LocalDateTime;

public class AccessLoggingDecorator extends DataServiceDecorator {

    private final String username;

    public AccessLoggingDecorator(DataService service, String username) {
        super(service);
        this.username = username;
    }

    @Override
    public String readData(String key) {
        System.out.println("[ACCESS LOG] " + LocalDateTime.now()
                + " | User: " + username + " | READ | Key: " + key);
        return wrappedService.readData(key);
    }

    @Override
    public void writeData(String key, String value) {
        System.out.println("[ACCESS LOG] " + LocalDateTime.now()
                + " | User: " + username + " | WRITE | Key: " + key);
        wrappedService.writeData(key, value);
    }

    @Override
    public String getServiceDescription() {
        return wrappedService.getServiceDescription() + " + AccessLoggingLayer";
    }
}
