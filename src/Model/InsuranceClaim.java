package Model;

import java.sql.Date;

public class InsuranceClaim {
    private int claimId;
    private int patientId;
    private String patientName;
    private String insuranceProvider;
    private String claimType;
    private double claimAmount;
    private String policyNumber;
    private String status;
    private String remarks;
    private Date claimDate;

    public InsuranceClaim() {}

    // Getters
    public int getClaimId()               { return claimId; }
    public int getPatientId()             { return patientId; }
    public String getPatientName()        { return patientName; }
    public String getInsuranceProvider()  { return insuranceProvider; }
    public String getClaimType()          { return claimType; }
    public double getClaimAmount()        { return claimAmount; }
    public String getPolicyNumber()       { return policyNumber; }
    public String getStatus()             { return status; }
    public String getRemarks()            { return remarks; }
    public Date getClaimDate()            { return claimDate; }

    // Setters
    public void setClaimId(int claimId)                       { this.claimId = claimId; }
    public void setPatientId(int patientId)                   { this.patientId = patientId; }
    public void setPatientName(String patientName)            { this.patientName = patientName; }
    public void setInsuranceProvider(String p)                { this.insuranceProvider = p; }
    public void setClaimType(String claimType)                { this.claimType = claimType; }
    public void setClaimAmount(double claimAmount)            { this.claimAmount = claimAmount; }
    public void setPolicyNumber(String policyNumber)          { this.policyNumber = policyNumber; }
    public void setStatus(String status)                      { this.status = status; }
    public void setRemarks(String remarks)                    { this.remarks = remarks; }
    public void setClaimDate(Date claimDate)                  { this.claimDate = claimDate; }
}