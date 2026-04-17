package Mediator;

import GUI.*;
import javax.swing.*;

public class DashboardMediator implements GlobeMedMediator {

    private JFrame parentDashboard;

    public DashboardMediator(JFrame dashboard) {
        this.parentDashboard = dashboard;
    }

    @Override
    public void notify(Object sender, String event, Object data) {
        switch (event) {

            case "OPEN_PATIENT_RECORDS":
                Model.User user = (Model.User) data;
                PatientRecordManagement patientForm
                        = new PatientRecordManagement((java.awt.Frame) parentDashboard, user);
                patientForm.setVisible(true);
                break;

            case "OPEN_APPOINTMENTS":
                AppointmentForm apptForm
                        = new AppointmentForm((java.awt.Frame) parentDashboard);
                apptForm.setVisible(true);
                break;

            case "OPEN_BILLING":
                BillingForm billingForm
                        = new BillingForm((java.awt.Frame) parentDashboard);
                billingForm.setVisible(true);
                break;

            case "OPEN_STAFF":
                StaffRoleForm staffForm
                        = new StaffRoleForm((java.awt.Frame) parentDashboard);
                staffForm.setVisible(true);
                break;

            case "OPEN_REPORTS":
                MedicalReport reportForm = new MedicalReport();
                reportForm.setVisible(true);
                break;

            case "PATIENT_SAVED":
                System.out.println("[Mediator] Patient saved event received: "
                        + data + " — notifying relevant components.");
                break;

            case "APPOINTMENT_BOOKED":
                System.out.println("[Mediator] Appointment booked: "
                        + data + " — cross-form notification handled.");
                break;

            case "LOGOUT":
                parentDashboard.dispose();
                new GUI.Login().setVisible(true);
                break;

            default:
                System.out.println("[Mediator] Unhandled event: " + event);
        }
    }
}
