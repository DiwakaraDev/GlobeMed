package Interpreter;

import Model.Patient;

public interface SearchExpression {

    boolean interpret(Patient patient);
}
