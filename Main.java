import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Screen screen = new Screen();
        while (true) {
            screen.mainMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    screen.menu2D();
                    choice2D(scanner, screen);
                    break;
                case 2:
                    screen.menu3D();
                    choice3D(scanner, screen);
                    break;
                case 3:
                    System.out.println("\n\n\t****| Good bye |****");
                    return;
                default:
                    System.out.println("\n\n\t error !! \n\t  enter.. ");
                    break;
            }
        }
    }

    static void choice2D(Scanner scanner, Screen screen) {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\n\tEnter the length of the side: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                screen.areaPerimeter(square);
                break;
            case 2:
                System.out.print("\n\tEnter the length: ");
                double length = scanner.nextDouble();
                System.out.print("\n\tEnter the width: ");
                double width = scanner.nextDouble();
                Rect rect = new Rect(length, width);
                screen.areaPerimeter(rect);
                break;
            case 3:
                System.out.print("\n\tEnter the side 1: ");
                double side1 = scanner.nextDouble();
                System.out.print("\n\tEnter the side 2: ");
                double side2 = scanner.nextDouble();
                System.out.print("\n\tEnter the side 3: ");
                double side3 = scanner.nextDouble();
                System.out.print("\n\tEnter the base: ");
                double base = scanner.nextDouble();
                System.out.print("\n\tEnter the height: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3, height, base);
                screen.areaPerimeter(triangle);
                break;
            case 4:
                System.out.print("\n\tEnter the radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                screen.areaPerimeter(circle);
                break;
            case 5:
                System.out.print("\n\tEnter the small diameter: ");
                double d1 = scanner.nextDouble();
                System.out.print("\n\tEnter the large diameter: ");
                double d2 = scanner.nextDouble();
                Rhombus rhombus = new Rhombus(d1, d2);
                screen.areaPerimeter(rhombus);
                break;
            case 6:
                return;
            default:
                break;
        }
    }

    static void choice3D(Scanner scanner, Screen screen) {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\n\tEnter the side: ");
                double side = scanner.nextDouble();
                Cube cube = new Cube(side);
                screen.volumeArea(cube);
                break;
            case 2:
                System.out.print("\n\tEnter the length: ");
                double length = scanner.nextDouble();
                System.out.print("\n\tEnter the width: ");
                double width = scanner.nextDouble();
                System.out.print("\n\tEnter the height: ");
                double height = scanner.nextDouble();
                RectCube rectCube = new RectCube(length, width, height);
                screen.volumeArea(rectCube);
                break;
            case 3:
                System.out.print("\n\tEnter the radius: ");
                double radius = scanner.nextDouble();
                System.out.print("\n\tEnter the height: ");
                height = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(radius, height);
                screen.volumeArea(cylinder);
                break;
            case 4:
                System.out.print("\n\tEnter the base length: ");
                double baseLength = scanner.nextDouble();
                System.out.print("\n\tEnter the base width: ");
                double baseWidth = scanner.nextDouble();
                System.out.print("\n\tEnter the height: ");
                height = scanner.nextDouble();
                Pyramid pyramid = new Pyramid(baseLength, baseWidth, height);
                screen.volumeArea(pyramid);
                break;
            case 5:
                System.out.print("\n\tEnter the radius: ");
                radius = scanner.nextDouble();
                Shaper shaper = new Shaper(radius);
                screen.volumeArea(shaper);
                break;
            case 6:
                return;
            default:
                break;
        }
    }
}