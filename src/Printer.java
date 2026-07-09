public class Printer {

    public static void printFace(char[][] face, String faceName) {

        System.out.println("\n" + faceName + " Face");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(face[i][j] + " ");
            }
            System.out.println();
        }
    }

}