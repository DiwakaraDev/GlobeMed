package Visitor;

/**
 * VISITOR PATTERN — Element Interface
 * Any report data object that can be "visited" implements this.
 */
public interface ReportElement {
    void accept(ReportVisitor visitor);
}