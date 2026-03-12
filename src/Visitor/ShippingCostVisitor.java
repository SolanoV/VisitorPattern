package Visitor;

import Visitable.Chair;
import Visitable.Sofa;
import Visitable.Table;

public interface ShippingCostVisitor {
    double visit(Chair chair);
    double visit(Table table);
    double visit(Sofa sofa);
}
