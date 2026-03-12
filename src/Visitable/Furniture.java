package Visitable;

import Visitor.ShippingCostVisitor;

public interface Furniture {
    double accept(ShippingCostVisitor visitor);
}
