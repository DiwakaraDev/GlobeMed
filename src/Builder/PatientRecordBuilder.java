package Builder;

import Model.PatientRecord;

public class PatientRecordBuilder {

    private int patientId;
    private String fullName = "";
    private String dob = "";
    private String gender = "";
    private String bloodType = "";
    private String allergies = "";
    private String medHistory = "";
    private String treatPlan = "";

    public PatientRecordBuilder setPatientId(int v) {
        this.patientId = v;
        return this;
    }

    public PatientRecordBuilder setFullName(String v) {
        this.fullName = v;
        return this;
    }

    public PatientRecordBuilder setDob(String v) {
        this.dob = v;
        return this;
    }

    public PatientRecordBuilder setGender(String v) {
        this.gender = v;
        return this;
    }

    public PatientRecordBuilder setBloodType(String v) {
        this.bloodType = v;
        return this;
    }

    public PatientRecordBuilder setAllergies(String v) {
        this.allergies = v;
        return this;
    }

    public PatientRecordBuilder setMedicalHistory(String v) {
        this.medHistory = v;
        return this;
    }

    public PatientRecordBuilder setTreatmentPlan(String v) {
        this.treatPlan = v;
        return this;
    }

    public PatientRecord build() {
        PatientRecord record = new PatientRecord();
        record.setPatientId(patientId);
        record.setFullName(fullName);
        record.setDob(dob);
        record.setGender(gender);
        record.setBloodType(bloodType);
        record.setAllergies(allergies);
        record.setMedicalHistory(medHistory);
        record.setTreatmentPlan(treatPlan);
        return record;
    }
}
