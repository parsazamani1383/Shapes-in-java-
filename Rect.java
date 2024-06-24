public class Rect extends Shape {
    private double length, width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }

    @Override
    double volume() {
        return 0;
    }
}
