package Model;

import java.time.LocalDate;

public class ReportEntry {
    private LocalDate date;
    private String details;
    private String doctor;
    private double amount;

    public ReportEntry() {}

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getDoctor() { return doctor; }
    public void setDoctor(String doctor) { this.doctor = doctor; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
