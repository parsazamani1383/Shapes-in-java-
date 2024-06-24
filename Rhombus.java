public class Rhombus extends Shape {
    private double d1, d2;

    public Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    double area() {
        return (d1 * d2) / 2;
    }

    @Override
    double perimeter() {
        return 4 * Math.sqrt(Math.pow(d1 / 2, 2) + Math.pow(d2 / 2, 2));
    }

    @Override
    double volume() {
        return 0;
    }
}

