package Decorator;

/**
 * DECORATOR PATTERN — Adds 15% tax on top of base amount.
 */
public class TaxDecorator extends BillingDecorator {

    private static final double TAX_RATE = 0.15;

    public TaxDecorator(BillingService service) {
        super(service);
    }

    @Override
    public double calculateTotal() {
        double base = wrappedService.calculateTotal();
        return base + (base * TAX_RATE);
    }

    @Override
    public String getDescription() {
        return wrappedService.getDescription() + " + Tax(15%)";
    }
}