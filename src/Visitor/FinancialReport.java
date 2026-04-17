package Visitor;

/**
 * VISITOR PATTERN — Concrete Element
 * Holds data for a Financial Report.
 */
public class FinancialReport implements ReportElement {

    private String patientId;
    private String fromDate;
    private String toDate;

    public FinancialReport(String patientId, String fromDate, String toDate) {
        this.patientId = patientId;
        this.fromDate  = fromDate;
        this.toDate    = toDate;
    }

    public String getPatientId() { return patientId; }
    public String getFromDate()  { return fromDate; }
    public String getToDate()    { return toDate; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}