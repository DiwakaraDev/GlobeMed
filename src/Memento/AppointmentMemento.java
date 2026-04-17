package Memento;

public class AppointmentMemento {

    private final int appointmentId;
    private final String status;
    private final String doctor;
    private final String appointmentDate;
    private final String timeSlot;
    private final String savedAt;

    public AppointmentMemento(int appointmentId, String status,
            String doctor, String appointmentDate,
            String timeSlot) {
        this.appointmentId = appointmentId;
        this.status = status;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.timeSlot = timeSlot;
        this.savedAt = java.time.LocalDateTime.now().toString();
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getStatus() {
        return status;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getSavedAt() {
        return savedAt;
    }
}
