package SecurityDecorator;

public interface DataService {

    String readData(String key);

    void writeData(String key, String value);

    String getServiceDescription();
}
