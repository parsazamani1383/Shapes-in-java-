public class RectCube extends Rect {
    private double height;

    public RectCube(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    double volume() {
        return getLen() * getWid() * height;
    }

    @Override
    double area() {
        return 2 * (getLen() * getWid() + getLen() * height + getWid() * height);
    }

    @Override
    double perimeter() {
        return 0;
    }

    private double getLen() {
        return 0;
    }

    private double getWid() {
        return 0;
    }
}
