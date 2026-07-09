import java.util.Scanner;

public class Input {

    public static char[][] readFace(Scanner scanner, String faceName) {

        System.out.println("Enter " + faceName + " Face");

        System.out.print("Row 1: ");
        String row1 = scanner.nextLine();

        System.out.print("Row 2: ");
        String row2 = scanner.nextLine();

        System.out.print("Row 3: ");
        String row3 = scanner.nextLine();

        String[] r1 = row1.split(" ");
        String[] r2 = row2.split(" ");
        String[] r3 = row3.split(" ");

        char[][] face = new char[3][3];

        face[0][0] = r1[0].charAt(0);
        face[0][1] = r1[1].charAt(0);
        face[0][2] = r1[2].charAt(0);

        face[1][0] = r2[0].charAt(0);
        face[1][1] = r2[1].charAt(0);
        face[1][2] = r2[2].charAt(0);

        face[2][0] = r3[0].charAt(0);
        face[2][1] = r3[1].charAt(0);
        face[2][2] = r3[2].charAt(0);

        return face;
    }
}