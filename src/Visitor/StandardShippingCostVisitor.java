package Visitor;

import Visitable.Chair;
import Visitable.Sofa;
import Visitable.Table;

import java.util.ArrayList;
import java.util.List;

public class StandardShippingCostVisitor implements ShippingCostVisitor {

    @Override
    public double visit(Chair chair) {
        double flatRate = 15.00;
        return flatRate + (chair.getWeight() * 0.50);
    }

    @Override
    public double visit(Table table) {
        double costPerSquareFoot = 2.50;
        return table.getArea() * costPerSquareFoot;
    }

    @Override
    public double visit(Sofa sofa) {
        double baseHandlingFee = 50.00;
        double distanceFee = sofa.getDeliveryDistanceMiles() * 1.75;
        double weightFee = sofa.getWeight() * 0.20;

        return baseHandlingFee + distanceFee + weightFee;
    }
}
