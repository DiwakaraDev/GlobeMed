package Observer;

public interface AppointmentSubject {
    void registerObserver(AppointmentObserver observer);
    void removeObserver(AppointmentObserver observer);
    void notifyObservers_Booked(Model.Appointment appointment);
    void notifyObservers_Cancelled(int appointmentId);
}