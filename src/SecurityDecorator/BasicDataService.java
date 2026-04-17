package SecurityDecorator;

import java.util.HashMap;
import java.util.Map;

public class BasicDataService implements DataService {

    private final Map<String, String> store = new HashMap<>();

    @Override
    public String readData(String key) {
        return store.getOrDefault(key, null);
    }

    @Override
    public void writeData(String key, String value) {
        store.put(key, value);
    }

    @Override
    public String getServiceDescription() {
        return "BasicDataService";
    }
}
