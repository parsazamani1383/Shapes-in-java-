public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double area() {
        return PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    double volume() {
        return 0;
    }
}