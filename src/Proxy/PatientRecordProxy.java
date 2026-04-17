package Proxy;

import Model.Patient;

public class PatientRecordProxy implements IPatientService {

    private final RealPatientService realService;
    private final String userRole;
    private final String username;

    public PatientRecordProxy(String username, String userRole) {
        this.realService = new RealPatientService();
        this.username    = username;
        this.userRole    = userRole;
    }

    @Override
    public Patient getPatientById(int patientId) {
        if (!canRead()) {
            throw new SecurityException(
                "Access Denied: " + username + " (" + userRole + ") cannot read patient records.");
        }
        logAccess("READ", patientId);
        return realService.getPatientById(patientId);
    }

    @Override
    public int createPatient(Patient patient) {
        if (!canWrite()) {
            throw new SecurityException(
                "Access Denied: " + username + " (" + userRole + ") cannot create patient records.");
        }
        logAccess("CREATE", -1);
        return realService.createPatient(patient);
    }

    @Override
    public boolean updatePatient(Patient patient) {
        if (!canWrite()) {
            throw new SecurityException(
                "Access Denied: " + username + " (" + userRole + ") cannot update patient records.");
        }
        logAccess("UPDATE", patient.getPatientId());
        return realService.updatePatient(patient);
    }

    //Permission rules
    private boolean canRead() {
        return userRole.equals("Doctor")
            || userRole.equals("Nurse")
            || userRole.equals("Administrator");
    }

    private boolean canWrite() {
        return userRole.equals("Doctor")
            || userRole.equals("Administrator");
    }

    //Access logging — security audit trail
    private void logAccess(String action, int patientId) {
        System.out.println("[AUDIT] " + java.time.LocalDateTime.now()
            + " | User: " + username
            + " | Role: " + userRole
            + " | Action: " + action
            + " | PatientID: " + (patientId == -1 ? "NEW" : patientId));
    }
}