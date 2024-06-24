public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    double area() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    double perimeter() {
        return 0;
    }
}
