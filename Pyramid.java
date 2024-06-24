public class Pyramid extends Shape {
    private double baseLength, baseWidth, height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    double volume() {
        return (1.0 / 3) * baseWidth * baseLength * height;
    }

    @Override
    double area() {
        double slantHeight = Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
        return baseLength * baseWidth + (0.5 * baseLength * slantHeight) + (0.5 * baseWidth * slantHeight);
    }

    @Override
    double perimeter() {
        return 0;
    }
}

