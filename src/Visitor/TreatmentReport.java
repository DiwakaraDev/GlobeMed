package Visitor;

public class TreatmentReport implements ReportElement {

    private String patientName;
    private String fromDate;
    private String toDate;

    public TreatmentReport(String patientName, String fromDate, String toDate) {
        this.patientName = patientName;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
