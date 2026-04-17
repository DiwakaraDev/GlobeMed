package Interpreter;

import Model.Patient;
import java.util.List;
import java.util.stream.Collectors;

public class PatientSearchContext {

    public static List<Patient> search(List<Patient> patients,
            SearchExpression expression) {
        return patients.stream()
                .filter(expression::interpret)
                .collect(Collectors.toList());
    }
}
