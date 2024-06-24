public class Cube extends Square {
    public Cube(double side) {
        super(side);
    }

    @Override
    double area() {
        return 6 * Math.pow(getSide(), 2);
    }

    @Override
    double volume() {
        return Math.pow(getSide(), 3);
    }

    @Override
    double perimeter() {
        return 0;
    }
}