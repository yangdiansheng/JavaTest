package pattern.access;

public interface Visitor {
    void visit(CommonEmplyee commonEmplyee);
    void visit(Manager manager);
}
