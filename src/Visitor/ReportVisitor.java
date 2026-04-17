package Visitor;

/**
 * VISITOR PATTERN — Visitor Interface Declares a visit method for each concrete
 * report element.
 */
public interface ReportVisitor {

    void visit(TreatmentReport report);

    void visit(DiagnosticReport report);

    void visit(FinancialReport report);
}
