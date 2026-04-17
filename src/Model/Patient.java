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

    public int getPatientId()     { return patientId; }
    public String getFullName()   { return fullName; }
    public LocalDate getDob()     { return dob; }
    public String getGender()     { return gender; }
    public String getContact()    { return contact; }
    public String getAddress()    { return address; }

    public void setPatientId(int v)       { this.patientId = v; }
    public void setFullName(String v)     { this.fullName = v; }
    public void setDob(LocalDate v)       { this.dob = v; }
    public void setGender(String v)       { this.gender = v; }
    public void setContact(String v)      { this.contact = v; }
    public void setAddress(String v)      { this.address = v; }
}