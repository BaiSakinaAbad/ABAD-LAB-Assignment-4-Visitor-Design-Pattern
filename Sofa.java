
class Sofa implements Furniture {
    private double length; // in meters
    private double width; 
    private double height; 

    public Sofa(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visitSofa(this);
    }
}