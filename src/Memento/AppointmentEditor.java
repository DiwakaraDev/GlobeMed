package Memento;

import Model.AppointmentDAO;

public class AppointmentEditor {

    private int appointmentId;
    private String status;
    private String doctor;
    private String appointmentDate;
    private String timeSlot;

    public AppointmentEditor(int appointmentId, String status,
            String doctor, String date, String timeSlot) {
        this.appointmentId = appointmentId;
        this.status = status;
        this.doctor = doctor;
        this.appointmentDate = date;
        this.timeSlot = timeSlot;
    }

    public AppointmentMemento save() {
        System.out.println("[Memento] State saved for appointment #" + appointmentId);
        return new AppointmentMemento(
                appointmentId, status, doctor, appointmentDate, timeSlot);
    }

    public void restore(AppointmentMemento memento) {
        this.status = memento.getStatus();
        this.doctor = memento.getDoctor();
        this.appointmentDate = memento.getAppointmentDate();
        this.timeSlot = memento.getTimeSlot();

        boolean restored = AppointmentDAO.restoreAppointmentStatus(
                memento.getAppointmentId(), memento.getStatus());

        if (restored) {
            System.out.println("[Memento] Appointment #"
                    + memento.getAppointmentId()
                    + " restored to status: " + memento.getStatus());
        }
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return appointmentId;
    }
}
