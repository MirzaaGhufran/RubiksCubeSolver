public class Moves {

    public static void rotateClockwise(char[][] face) {

        char[][] temp = new char[3][3];

        temp[0][0] = face[2][0];
        temp[0][1] = face[1][0];
        temp[0][2] = face[0][0];

        temp[1][0] = face[2][1];
        temp[1][1] = face[1][1];
        temp[1][2] = face[0][1];

        temp[2][0] = face[2][2];
        temp[2][1] = face[1][2];
        temp[2][2] = face[0][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                face[i][j] = temp[i][j];
            }
        }
    }
}