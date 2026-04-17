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

    public int getGeneratedId() {
        return generatedId;
    }
}
