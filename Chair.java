// Concrete element: Chair
class Chair implements Furniture {
    private double weight; // in kg

    public Chair(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visitChair(this);
    }
}