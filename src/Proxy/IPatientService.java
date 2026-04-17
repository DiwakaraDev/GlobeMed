package Proxy;

import Model.Patient;

public interface IPatientService {

    Patient getPatientById(int patientId);

    int createPatient(Patient patient);

    boolean updatePatient(Patient patient);
}
