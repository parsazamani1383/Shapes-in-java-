public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }

    @Override
    double volume() {
        return 0;
    }
}
