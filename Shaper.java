public class Shaper extends Circle {
    public Shaper(double radius) {
        super(radius);
    }

    @Override
    double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    double area() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    double perimeter() {
        return 0;
    }
}
