package Command;

import Model.AppointmentDAO;

/**
 * COMMAND PATTERN — Concrete Command
 * Encapsulates the "Cancel Appointment" action.
 */
public class CancelAppointmentCommand implements Command {

    private int appointmentId;

    public CancelAppointmentCommand(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public void execute() {
        boolean ok = AppointmentDAO.cancelAppointment(appointmentId);
        System.out.println(ok
            ? "✅ CancelAppointmentCommand executed. ID: " + appointmentId
            : "❌ Cancel failed for ID: " + appointmentId);
    }
}