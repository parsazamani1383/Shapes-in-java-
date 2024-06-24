public class Triangle extends Shape {
    private double s1, s2, s3, height, base;

    public Triangle(double s1, double s2, double s3, double height, double base) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    double perimeter() {
        return s1 + s2 + s3;
    }

    @Override
    double volume() {
        return 0;
    }
}