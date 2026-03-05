// Client code to test the visitor pattern

public class Main {
    public static void main(String[] args) {
        // Create some furniture items
        Furniture chair1 = new Chair(5.0);
        Furniture table1 = new Table(2.0, 1.5); 
        Furniture sofa1 = new Sofa(2.5, 1.0, 0.8); 

        // visitor
        ShippingCostVisitor visitor = new ShippingCostVisitor();

    
        System.out.println("Order 1:");
        chair1.accept(visitor);
        table1.accept(visitor);
        sofa1.accept(visitor);

      
        System.out.println("Total shipping cost: $" + visitor.getTotalCost());
        System.out.println();

        // another order
        visitor.reset();
        Furniture chair2 = new Chair(3.0);
        Furniture table2 = new Table(1.5, 1.0);

        System.out.println("Order 2:");
        chair2.accept(visitor);
        table2.accept(visitor);

        System.out.println("Total shipping cost for second order: $" + visitor.getTotalCost());
    }
}