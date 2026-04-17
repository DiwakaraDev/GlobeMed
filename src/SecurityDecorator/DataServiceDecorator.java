package SecurityDecorator;

public abstract class DataServiceDecorator implements DataService {

    protected final DataService wrappedService;

    protected DataServiceDecorator(DataService service) {
        this.wrappedService = service;
    }

    @Override
    public String readData(String key) {
        return wrappedService.readData(key);
    }

    @Override
    public void writeData(String key, String value) {
        wrappedService.writeData(key, value);
    }

    @Override
    public String getServiceDescription() {
        return wrappedService.getServiceDescription();
    }
}
