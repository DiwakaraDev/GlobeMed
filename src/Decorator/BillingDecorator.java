package Decorator;

public abstract class BillingDecorator implements BillingService {

    protected BillingService wrappedService;

    public BillingDecorator(BillingService service) {
        this.wrappedService = service;
    }

    @Override
    public double calculateTotal() {
        return wrappedService.calculateTotal();
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription();
    }
}
