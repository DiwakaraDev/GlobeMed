package Chain;

public class ClaimRequest {

    private String patientName;
    private String insuranceProvider;
    private String claimType;
    private double claimAmount;
    private String policyNumber;
    private String status;
    private String remarks;

    public ClaimRequest(String patientName, String insuranceProvider,
            String claimType, double claimAmount, String policyNumber) {
        this.patientName = patientName;
        this.insuranceProvider = insuranceProvider;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
        this.policyNumber = policyNumber;
        this.status = "Pending";
        this.remarks = "";
    }

    public String getPatientName() {
        return patientName;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
