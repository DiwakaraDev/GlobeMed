package Observer;

import Model.Appointment;
import javax.swing.table.DefaultTableModel;

public class AppointmentTableObserver implements AppointmentObserver {

    private final DefaultTableModel tableModel;

    public AppointmentTableObserver(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    @Override
    public void onAppointmentBooked(Appointment appointment) {
        tableModel.addRow(new Object[]{
            appointment.getDoctor(),
            appointment.getAppointmentDate(),
            appointment.getTimeSlot(),
            appointment.getStatus()
        });
        System.out.println("Table updated: new appointment added");
    }

    @Override
    public void onAppointmentCancelled(int appointmentId) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {

            System.out.println("Table updated: appointment " + appointmentId + " cancelled");
        }
    }
}
