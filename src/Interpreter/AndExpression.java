package Interpreter;

import Model.Patient;

public class AndExpression implements SearchExpression {

    private final SearchExpression left;
    private final SearchExpression right;

    public AndExpression(SearchExpression left, SearchExpression right) {
        this.left  = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Patient patient) {
        return left.interpret(patient) && right.interpret(patient);
    }
}