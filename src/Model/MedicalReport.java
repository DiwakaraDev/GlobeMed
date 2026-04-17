package Model;

public class MedicalReport {

    private int reportId;
    private int patientId;
    private String patientName;
    private String reportType;
    private String reportContent;
    private String generatedBy;

    public int getReportId() {
        return reportId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getReportType() {
        return reportType;
    }

    public String getReportContent() {
        return reportContent;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setReportId(int v) {
        this.reportId = v;
    }

    public void setPatientId(int v) {
        this.patientId = v;
    }

    public void setPatientName(String v) {
        this.patientName = v;
    }

    public void setReportType(String v) {
        this.reportType = v;
    }

    public void setReportContent(String v) {
        this.reportContent = v;
    }

    public void setGeneratedBy(String v) {
        this.generatedBy = v;
    }
}
