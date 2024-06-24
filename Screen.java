public class Screen {
    void mainMenu() {
        System.out.println("\n************************");
        System.out.println("**       Welcome      **");
        System.out.println("************************");
        System.out.println("\n 1 - 2D Shapes \n");
        System.out.println(" 2 - 3D Shapes \n");
        System.out.println(" 3 - Exit \n");
        System.out.print(" Enter your choice: ");
    }

    void menu2D() {
        System.out.println("\n------------------");
        System.out.println("|    2D Shapes   |");
        System.out.println("------------------");
        System.out.println(" 1- Square ");
        System.out.println(" 2- Rect ");
        System.out.println(" 3- Triangle ");
        System.out.println(" 4- Circle ");
        System.out.println(" 5- Rhombus ");
        System.out.println(" 6- Back ");
        System.out.print("\n Enter your choice: ");
    }

    void menu3D() {
        System.out.println("\n------------------");
        System.out.println("|    3D Shapes   |");
        System.out.println("------------------");
        System.out.println(" 1- Cube ");
        System.out.println(" 2- Rect Cube ");
        System.out.println(" 3- Cylinder ");
        System.out.println(" 4- Pyramid ");
        System.out.println(" 5- Shaper ");
        System.out.println(" 6- Back ");
        System.out.print("\n Enter your choice: ");
    }

    void areaPerimeter(Shape shape) {
        System.out.println("\n------------------");
        System.out.println(" Area = " + shape.area());
        System.out.println(" Perimeter = " + shape.perimeter());
        System.out.println("\n------------------");
    }

    void volumeArea(Shape shape) {
        System.out.println("\n------------------");
        System.out.println(" Area = " + shape.area());
        System.out.println(" Volume = " + shape.volume());
        System.out.println("\n------------------");
    }
}
