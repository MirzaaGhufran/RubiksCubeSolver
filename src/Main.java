import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rubik's Cube Solver ===");

        Cube cube = new Cube();

        // ==========================
        // MANUAL INPUT (Uncomment later)
        // ==========================

        /*
        System.out.println("Enter each row with spaces.");
        System.out.println("Example: W W W");
        System.out.println("W = White");
        System.out.println("Y = Yellow");
        System.out.println("R = Red");
        System.out.println("O = Orange");
        System.out.println("G = Green");
        System.out.println("B = Blue");
        System.out.println();

        cube.up = Input.readFace(scanner, "UP");
        cube.left = Input.readFace(scanner, "LEFT");
        cube.right = Input.readFace(scanner, "RIGHT");
        cube.front = Input.readFace(scanner, "FRONT");
        cube.back = Input.readFace(scanner, "BACK");
        cube.down = Input.readFace(scanner, "DOWN");
        */

        // ==========================
        // SOLVED CUBE (Temporary)
        // ==========================

        cube.up = new char[][]{
            {'W','W','W'},
            {'W','W','W'},
            {'W','W','W'}
        };

        cube.left = new char[][]{
            {'O','O','O'},
            {'O','O','O'},
            {'O','O','O'}
        };

        cube.right = new char[][]{
            {'R','R','R'},
            {'R','R','R'},
            {'R','R','R'}
        };

        cube.front = new char[][]{
            {'G','G','G'},
            {'G','G','G'},
            {'G','G','G'}
        };

        cube.back = new char[][]{
            {'B','B','B'},
            {'B','B','B'},
            {'B','B','B'}
        };

        cube.down = new char[][]{
            {'Y','Y','Y'},
            {'Y','Y','Y'},
            {'Y','Y','Y'}
        };

        System.out.println("Before Move:\n");

        Printer.printFace(cube.up, "UP");
        Printer.printFace(cube.left, "LEFT");
        Printer.printFace(cube.right, "RIGHT");
        Printer.printFace(cube.front, "FRONT");
        Printer.printFace(cube.back, "BACK");
        Printer.printFace(cube.down, "DOWN");

        // Change this to test any move
        // Moves.U(cube);
        // Moves.D(cube);
        // Moves.L(cube);
        // Moves.R(cube);
        // Moves.F(cube);
        Moves.B(cube);

        System.out.println("\nAfter Move:\n");

        Printer.printFace(cube.up, "UP");
        Printer.printFace(cube.left, "LEFT");
        Printer.printFace(cube.right, "RIGHT");
        Printer.printFace(cube.front, "FRONT");
        Printer.printFace(cube.back, "BACK");
        Printer.printFace(cube.down, "DOWN");

        scanner.close();
    }
}




// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("=== Rubik's Cube Solver ===");
//         System.out.println("Enter each row with spaces.");
//         System.out.println("Example: W W W");
//         System.out.println("W = White");
//         System.out.println("Y = Yellow");
//         System.out.println("R = Red");
//         System.out.println("O = Orange");
//         System.out.println("G = Green");
//         System.out.println("B = Blue");
//         System.out.println();

//         Cube cube = new Cube();

//         cube.up = Input.readFace(scanner, "UP");
//         cube.left = Input.readFace(scanner, "LEFT");
//         cube.right = Input.readFace(scanner, "RIGHT");
//         cube.front = Input.readFace(scanner, "FRONT");
//         cube.back = Input.readFace(scanner, "BACK");
//         cube.down = Input.readFace(scanner, "DOWN");

//         Printer.printFace(cube.up, "UP");
//         Printer.printFace(cube.left, "LEFT");
//         Printer.printFace(cube.right, "RIGHT");
//         Printer.printFace(cube.front, "FRONT");
//         Printer.printFace(cube.back, "BACK");
//         Printer.printFace(cube.down, "DOWN");
        
//         Moves.U(cube);

//         System.out.println("\nAfter U Move:\n");

//         Printer.printFace(cube.up, "UP");
//         Printer.printFace(cube.left, "LEFT");
//         Printer.printFace(cube.right, "RIGHT");
//         Printer.printFace(cube.front, "FRONT");
//         Printer.printFace(cube.back, "BACK");
//         Printer.printFace(cube.down, "DOWN");
//     }

// }