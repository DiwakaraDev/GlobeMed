package Model;

import java.time.LocalDate;

public class TreatmentPlan {
    private int planId;
    private int patientId;
    private String treatmentDescription;
    private String prescribedMedication;
    private LocalDate startDate;
    private LocalDate endDate;

    public TreatmentPlan() {}

    public int getPlanId() { return planId; }
    public void setPlanId(int planId) { this.planId = planId; }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getTreatmentDescription() { return treatmentDescription; }
    public void setTreatmentDescription(String treatmentDescription) { this.treatmentDescription = treatmentDescription; }

    public String getPrescribedMedication() { return prescribedMedication; }
    public void setPrescribedMedication(String prescribedMedication) { this.prescribedMedication = prescribedMedication; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
    
}
