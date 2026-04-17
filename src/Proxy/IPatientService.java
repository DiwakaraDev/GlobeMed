// ✅ PatientRecordProxy.java — Security proxy controlling access to patient data
package Proxy;

import Model.Patient;

public interface IPatientService {
    Patient getPatientById(int patientId);
    int createPatient(Patient patient);
    boolean updatePatient(Patient patient);
}