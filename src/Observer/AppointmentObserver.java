package Observer;

import Model.Appointment;

public interface AppointmentObserver {
    void onAppointmentBooked(Appointment appointment);
    void onAppointmentCancelled(int appointmentId);
}