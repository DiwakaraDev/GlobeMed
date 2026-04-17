package Interpreter;

import Model.Patient;

public class GenderExpression implements SearchExpression {

    private final String gender;

    public GenderExpression(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean interpret(Patient patient) {
        if (patient.getGender() == null) {
            return false;
        }
        return patient.getGender().equalsIgnoreCase(gender);
    }
}
