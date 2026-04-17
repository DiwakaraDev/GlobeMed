package Interpreter;

import Model.Patient;

public class NameContainsExpression implements SearchExpression {

    private final String keyword;

    public NameContainsExpression(String keyword) {
        this.keyword = keyword.toLowerCase();
    }

    @Override
    public boolean interpret(Patient patient) {
        if (patient.getFullName() == null) {
            return false;
        }
        return patient.getFullName().toLowerCase().contains(keyword);
    }
}
