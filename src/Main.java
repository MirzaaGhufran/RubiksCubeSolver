import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rubik's Cube Solver ===");
        System.out.println("Enter each row with spaces.");
        System.out.println("Example: W W W");
        System.out.println("W = White");
        System.out.println("Y = Yellow");
        System.out.println("R = Red");
        System.out.println("O = Orange");
        System.out.println("G = Green");
        System.out.println("B = Blue");
        System.out.println();

        Cube cube = new Cube();

        cube.up = Input.readFace(scanner, "UP");
        cube.left = Input.readFace(scanner, "LEFT");
        cube.right = Input.readFace(scanner, "RIGHT");
        cube.front = Input.readFace(scanner, "FRONT");
        cube.back = Input.readFace(scanner, "BACK");
        cube.down = Input.readFace(scanner, "DOWN");

        Printer.printFace(cube.up, "UP");
        Printer.printFace(cube.left, "LEFT");
        Printer.printFace(cube.right, "RIGHT");
        Printer.printFace(cube.front, "FRONT");
        Printer.printFace(cube.back, "BACK");
        Printer.printFace(cube.down, "DOWN");

        Moves.rotateClockwise(cube.up);

        System.out.println("\nAfter rotating UP:");

        Printer.printFace(cube.up, "UP");
    }

}