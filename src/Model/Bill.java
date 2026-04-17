package Model;

public class Bill {

    private int billingId;
    private int patientId;
    private String patientName;
    private double subtotal;
    private double afterTax;
    private double finalAmount;
    private String description;

    public Bill() {
    }

    public int getBillingId() {
        return billingId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getAfterTax() {
        return afterTax;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setAfterTax(double afterTax) {
        this.afterTax = afterTax;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
