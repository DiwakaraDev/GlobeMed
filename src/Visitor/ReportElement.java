package Visitor;

public interface ReportElement {

    void accept(ReportVisitor visitor);
}
