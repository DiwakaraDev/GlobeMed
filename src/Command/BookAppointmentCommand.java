package Command;

import Model.Appointment;
import Model.AppointmentDAO;

public class BookAppointmentCommand implements Command {

    private Appointment appointment;
    private int generatedId = -1;

    public BookAppointmentCommand(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public void execute() {
        generatedId = AppointmentDAO.saveAppointment(appointment);
        System.out.println("BookAppointmentCommand executed. ID: " + generatedId);
    }

    @Override
    public void undo() {
        if (generatedId == -1) {
            System.out.println("BookAppointmentCommand.undo(): Nothing to undo — command was never executed.");
            return;
        }
        boolean ok = AppointmentDAO.cancelAppointment(generatedId);
        System.out.println(ok
                ? "BookAppointmentCommand undone. Appointment ID " + generatedId + " cancelled."
                : "BookAppointmentCommand.undo() failed for ID: " + generatedId);
        generatedId = -1;
    }

    public int getGeneratedId() {
        return generatedId;
    }
}
