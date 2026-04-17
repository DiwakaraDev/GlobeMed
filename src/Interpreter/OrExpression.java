package Interpreter;

import Model.Patient;

public class OrExpression implements SearchExpression {

    private final SearchExpression left;
    private final SearchExpression right;

    public OrExpression(SearchExpression left, SearchExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Patient patient) {
        return left.interpret(patient) || right.interpret(patient);
    }
}
