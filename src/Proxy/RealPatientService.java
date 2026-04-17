package Proxy;

import Model.Patient;
import Model.PatientDAO;

public class RealPatientService implements IPatientService {

    @Override
    public Patient getPatientById(int patientId) {
        return PatientDAO.getPatientById(patientId);
    }

    @Override
    public int createPatient(Patient patient) {
        return PatientDAO.createPatient(patient);
    }

    @Override
    public boolean updatePatient(Patient patient) {
        return PatientDAO.updatePatient(patient);
    }
}
