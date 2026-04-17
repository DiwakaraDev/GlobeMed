package Observer;

import Model.Appointment;
import Model.AppointmentDAO;
import java.util.ArrayList;
import java.util.List;

public class AppointmentScheduler implements AppointmentSubject {

    private final List<AppointmentObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(AppointmentObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(AppointmentObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers_Booked(Appointment appointment) {
        for (AppointmentObserver o : observers) {
            o.onAppointmentBooked(appointment);
        }
    }

    @Override
    public void notifyObservers_Cancelled(int appointmentId) {
        for (AppointmentObserver o : observers) {
            o.onAppointmentCancelled(appointmentId);
        }
    }

    public boolean bookAppointment(int patientId, String doctor,
            String type, String date, String timeSlot) {

        if (isConflict(doctor, date, timeSlot)) {
            System.out.println("Scheduling conflict detected: "
                    + doctor + " is already booked at " + timeSlot + " on " + date);
            return false;
        }

        boolean success = AppointmentDAO.bookAppointment(
                patientId, doctor, type, date, timeSlot);

        if (success) {
            Appointment appt = new Appointment();
            appt.setPatientId(patientId);
            appt.setDoctor(doctor);
            appt.setType(type);
            appt.setAppointmentDate(date);
            appt.setTimeSlot(timeSlot);
            appt.setStatus("Available");

            notifyObservers_Booked(appt);
        }
        return success;
    }

    public boolean cancelAppointment(int appointmentId) {
        boolean success = AppointmentDAO.cancelAppointment(appointmentId);
        if (success) {
            notifyObservers_Cancelled(appointmentId);
        }
        return success;
    }

    private boolean isConflict(String doctor, String date, String timeSlot) {
        java.util.List<java.util.Map<String, Object>> existing
                = AppointmentDAO.getAppointmentsByDoctorAndDate(doctor, date);

        for (java.util.Map<String, Object> row : existing) {
            if (timeSlot.equals(row.get("time_slot"))
                    && !"Cancelled".equals(row.get("status"))) {
                return true;
            }
        }
        return false;
    }
}
