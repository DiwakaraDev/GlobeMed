package Decorator;

public class InsuranceDecorator extends BillingDecorator {

    private double discountAmount;

    public InsuranceDecorator(BillingService service, double discountAmount) {
        super(service);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateTotal() {
        double total = wrappedService.calculateTotal();
        return Math.max(0, total - discountAmount);
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription() + " - Insurance Discount(Rs. " + discountAmount + ")";
    }
}
