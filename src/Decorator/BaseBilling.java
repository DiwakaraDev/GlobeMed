package Decorator;

public class BaseBilling implements BillingService {

    private double amount;

    public BaseBilling(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateTotal() {
        return amount;
    }

    @Override
    public String getDescription() {
        return "Basic Billing: Rs. " + amount;
    }
}