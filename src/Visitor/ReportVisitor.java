package Visitor;

public interface ReportVisitor {

    void visit(TreatmentReport report);

    void visit(DiagnosticReport report);

    void visit(FinancialReport report);
}
