
class ShippingCostVisitor implements ShippingVisitor {
    private double totalCost = 0.0;

    @Override
    public void visitChair(Chair chair) {
        double cost = 10.0;
        totalCost += cost;
        System.out.println("Chair (weight: " + chair.getWeight() + "kg) shipping cost: $" + cost);
    }

    @Override
    public void visitTable(Table table) {
        double area = table.getLength() * table.getWidth();
        double cost = 2.0 * area;
        totalCost += cost;
        System.out.println("Table (" + table.getLength() + "m x " + table.getWidth() + "m) shipping cost: $" + cost);
    }

    @Override
    public void visitSofa(Sofa sofa) {
        double volume = sofa.getLength() * sofa.getWidth() * sofa.getHeight();
        double cost = 0.5 * volume;
        totalCost += cost;
        System.out.println("Sofa (" + sofa.getLength() + "m x " + sofa.getWidth() + "m x " + sofa.getHeight() + "m) shipping cost: $" + cost);
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void reset() {
        totalCost = 0.0;
    }
}