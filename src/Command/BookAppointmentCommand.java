package Command;

import Model.Appointment;
import Model.AppointmentDAO;

/**
 * COMMAND PATTERN — Concrete Command
 * Encapsulates the "Book Appointment" action.
 */
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

    // Retrieve the DB-generated ID after execute()
    public int getGeneratedId() {
        return generatedId;
    }
}