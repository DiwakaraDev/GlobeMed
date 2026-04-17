package Model;

public class PatientRecord {

    private int recordId;
    private int patientId;
    private String fullName;
    private String dob;
    private String gender;
    private String bloodType;
    private String allergies;
    private String medicalHistory;
    private String treatmentPlan;

    public PatientRecord() {
    }

    public int getRecordId() {
        return recordId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setRecordId(int v) {
        this.recordId = v;
    }

    public void setPatientId(int v) {
        this.patientId = v;
    }

    public void setFullName(String v) {
        this.fullName = v;
    }

    public void setDob(String v) {
        this.dob = v;
    }

    public void setGender(String v) {
        this.gender = v;
    }

    public void setBloodType(String v) {
        this.bloodType = v;
    }

    public void setAllergies(String v) {
        this.allergies = v;
    }

    public void setMedicalHistory(String v) {
        this.medicalHistory = v;
    }

    public void setTreatmentPlan(String v) {
        this.treatmentPlan = v;
    }
}
