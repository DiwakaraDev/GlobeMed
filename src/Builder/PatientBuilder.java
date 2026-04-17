package Builder;

import Model.Patient;
import java.time.LocalDate;

/**
 * BUILDER PATTERN — Builder for Patient object.
 * Constructs a Patient step-by-step with method chaining.
 */
public class PatientBuilder {

    private String fullName = "";
    private LocalDate dob   = null;
    private String gender   = "";
    private String contact  = "";
    private String address  = "";

    public PatientBuilder setFullName(String v)   { this.fullName = v; return this; }
    public PatientBuilder setDob(LocalDate v)      { this.dob = v;      return this; }
    public PatientBuilder setGender(String v)      { this.gender = v;   return this; }
    public PatientBuilder setContact(String v)     { this.contact = v;  return this; }
    public PatientBuilder setAddress(String v)     { this.address = v;  return this; }

    // Final step — assembles the Patient object
    public Patient build() {
        Patient p = new Patient();
        p.setFullName(fullName);
        p.setDob(dob);
        p.setGender(gender);
        p.setContact(contact);
        p.setAddress(address);
        return p;
    }
}