package Visitable;

import Visitor.ShippingCostVisitor;

public class Sofa implements Furniture {
    private double weight;
    private double deliveryDistanceMiles;

    public Sofa(double weight, double deliveryDistanceMiles) {
        this.weight = weight;
        this.deliveryDistanceMiles = deliveryDistanceMiles;
    }

    public double getWeight() {
        return weight;
    }

    public double getDeliveryDistanceMiles() {
        return deliveryDistanceMiles;
    }

    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}