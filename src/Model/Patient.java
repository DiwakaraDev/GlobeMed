package Model;

import java.time.LocalDate;

public class Patient {
    private int patientId;
    private String fullName;
    private LocalDate dob;
    private String gender;
    private String contact;
    private String address;

    public Patient() {}

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
