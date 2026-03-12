import Visitable.Chair;
import Visitable.Furniture;
import Visitable.Sofa;
import Visitable.Table;
import Visitor.ShippingCostVisitor;
import Visitor.StandardShippingCostVisitor;

import java.util.ArrayList;
import java.util.List;

public class ECommerceApp {
    public static void main(String[] args) {
        List<Furniture> shoppingCart = new ArrayList<>();
        shoppingCart.add(new Chair(12.5));
        shoppingCart.add(new Chair(10.0));
        shoppingCart.add(new Table(6.0, 3.5));
        shoppingCart.add(new Sofa(200.0, 25.0));


        ShippingCostVisitor shippingCalculator = new StandardShippingCostVisitor();
        double totalShippingCost = 0.0;

        System.out.println("--- Order Shipping Breakdown ---");
        for (Furniture item : shoppingCart) {
            double cost = item.accept(shippingCalculator);
            System.out.println(item.getClass().getSimpleName() + " shipping cost: $" + String.format("%.2f", cost));
            totalShippingCost += cost;
        }

        System.out.println("--------------------------------");
        System.out.println("Total Shipping Cost: $" + String.format("%.2f", totalShippingCost));
    }
}