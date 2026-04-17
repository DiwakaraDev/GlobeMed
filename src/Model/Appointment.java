package Model;

public class Appointment {

    private int appointmentId;
    private int patientId;
    private String patientName;
    private String doctor;
    private String type;
    private String appointmentDate;
    private String timeSlot;
    private String status;

    public Appointment() {
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getType() {
        return type;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getStatus() {
        return status;
    }

    public void setAppointmentId(int v) {
        this.appointmentId = v;
    }

    public void setPatientId(int v) {
        this.patientId = v;
    }

    public void setPatientName(String v) {
        this.patientName = v;
    }

    public void setDoctor(String v) {
        this.doctor = v;
    }

    public void setType(String v) {
        this.type = v;
    }

    public void setAppointmentDate(String v) {
        this.appointmentDate = v;
    }

    public void setTimeSlot(String v) {
        this.timeSlot = v;
    }

    public void setStatus(String v) {
        this.status = v;
    }

    public void setDate(java.time.LocalDate date) {
        this.appointmentDate = (date != null) ? date.toString() : "";
    }
}
