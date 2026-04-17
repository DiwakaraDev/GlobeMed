package Command;

import Model.AppointmentDAO;

public class CancelAppointmentCommand implements Command {

    private int appointmentId;

    public CancelAppointmentCommand(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public void execute() {
        boolean ok = AppointmentDAO.cancelAppointment(appointmentId);
        System.out.println(ok
                ? "CancelAppointmentCommand executed. ID: " + appointmentId
                : "Cancel failed for ID: " + appointmentId);
    }

    @Override
    public void undo() {
        boolean ok = AppointmentDAO.restoreAppointment(appointmentId);
        System.out.println(ok
                ? "CancelAppointmentCommand undone. Appointment ID " + appointmentId + " restored to Scheduled."
                : "CancelAppointmentCommand.undo() failed for ID: " + appointmentId);
    }
}
