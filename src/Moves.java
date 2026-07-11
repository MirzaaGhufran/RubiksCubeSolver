public class Moves {

    // Rotates any 3×3 face clockwise
    public static void rotateClockwise(char[][] face) {

        // Temporary face to store rotated values
        char[][] temp = new char[3][3];

        // Rotate the face
        temp[0][0] = face[2][0];
        temp[0][1] = face[1][0];
        temp[0][2] = face[0][0];

        temp[1][0] = face[2][1];
        temp[1][1] = face[1][1];
        temp[1][2] = face[0][1];

        temp[2][0] = face[2][2];
        temp[2][1] = face[1][2];
        temp[2][2] = face[0][2];

        // Copy the rotated face back
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                face[i][j] = temp[i][j];
            }
        }
    }

    // Performs a clockwise U (Up) move
    public static void U(Cube cube) {

        // Rotate the UP face
        rotateClockwise(cube.up);

        // Temporary array to save the FRONT top row
        char[] temp = new char[3];

        // Save FRONT top row
        temp[0] = cube.front[0][0];
        temp[1] = cube.front[0][1];
        temp[2] = cube.front[0][2];

        // Move LEFT top row to FRONT top row
        cube.front[0][0] = cube.left[0][0];
        cube.front[0][1] = cube.left[0][1];
        cube.front[0][2] = cube.left[0][2];

        // Move BACK top row to LEFT top row
        cube.left[0][0] = cube.back[0][0];
        cube.left[0][1] = cube.back[0][1];
        cube.left[0][2] = cube.back[0][2];

        // Move RIGHT top row to BACK top row
        cube.back[0][0] = cube.right[0][0]; 
        cube.back[0][1] = cube.right[0][1];
        cube.back[0][2] = cube.right[0][2];

        // Move saved FRONT top row to RIGHT top row
        cube.right[0][0] = temp[0];
        cube.right[0][1] = temp[1];
        cube.right[0][2] = temp[2];
    }

    public static void D(Cube cube) {

        // Rotate the DOWN face
        rotateClockwise(cube.down);

        // Temporary array to save the FRONT bottom row
        char[] temp = new char[3];

        // Save FRONT bottom row
        temp[0] = cube.front[2][0];
        temp[1] = cube.front[2][1];
        temp[2] = cube.front[2][2];

        // Move LEFT bottom row to FRONT bottom row
        cube.front[2][0] = cube.left[2][0];
        cube.front[2][1] = cube.left[2][1];
        cube.front[2][2] = cube.left[2][2];

        // Move BACK bottom row to LEFT bottom row
        cube.left[2][0] = cube.back[2][0];
        cube.left[2][1] = cube.back[2][1];
        cube.left[2][2] = cube.back[2][2];

        // Move RIGHT bottom row to BACK bottom row
        cube.back[2][0] = cube.right[2][0];
        cube.back[2][1] = cube.right[2][1];
        cube.back[2][2] = cube.right[2][2];

        // Move saved FRONT bottom row to RIGHT bottom row
        cube.right[2][0] = temp[0];
        cube.right[2][1] = temp[1];
        cube.right[2][2] = temp[2];
    }
    public static void L(Cube cube) {

        // Rotate the LEFT face
        rotateClockwise(cube.left);

        // Temporary array to save the FRONT bottom row
        char[] temp = new char[3];

        // Save FRONT Left Row
        temp[0] = cube.front[0][0];
        temp[1] = cube.front[1][0];
        temp[2] = cube.front[2][0];

        // Move DOWN LEFT row to FRONT LEFT row
        cube.front[0][0] = cube.down[0][0];
        cube.front[1][0] = cube.down[1][0];
        cube.front[2][0] = cube.down[2][0];

        // Move BACK bottom row to DOWN bottom row
        cube.down[0][0] = cube.back[0][0];
        cube.down[1][0] = cube.back[1][0];
        cube.down[2][0] = cube.back[2][0];

        // Move UP bottom row to BACK bottom row
        cube.back[0][0] = cube.up[0][0];
        cube.back[1][0] = cube.up[1][0];
        cube.back[2][0] = cube.up[2][0];

        // Move saved FRONT bottom row to UP bottom row
        cube.up[0][0] = temp[0];
        cube.up[1][0] = temp[1];
        cube.up[2][0] = temp[2];    
    }
    public static void R(Cube cube) {
        rotateClockwise(cube.right);

        char[] temp = new char[3];

        temp[0] = cube.front[0][2];
        temp[1] = cube.front[1][2];
        temp[2] = cube.front[2][2];

        cube.front[0][2] = cube.down[0][2];
        cube.front[1][2] = cube.down[1][2];
        cube.front[2][2] = cube.down[2][2];

        cube.down[0][2] = cube.back[0][2];
        cube.down[1][2] = cube.back[1][2];
        cube.down[2][2] = cube.back[2][2];

        cube.back[0][2] = cube.up[0][2];
        cube.back[1][2] = cube.up[1][2];
        cube.back[2][2] = cube.up[2][2];

        cube.up[0][2] = temp[0];
        cube.up[1][2] = temp[1];
        cube.up[2][2] = temp[2];

    }
    public static void F(Cube cube) {
        rotateClockwise(cube.front);

        char[] temp = new char[3];

        temp[0] = cube.up[2][0];
        temp[1] = cube.up[2][1];
        temp[2] = cube.up[2][2];

        cube.up[2][0] = cube.left[2][2];
        cube.up[2][1] = cube.left[1][2];
        cube.up[2][2] = cube.left[0][2];

        cube.left[2][2] = cube.down[0][2];
        cube.left[1][2] = cube.down[0][1];
        cube.left[0][2] = cube.down[0][0];

        cube.down[0][2] = cube.right[0][0];
        cube.down[0][1] = cube.right[1][0];
        cube.down[0][0] = cube.right[2][0];

        cube.right[0][0] = temp[0];
        cube.right[1][0] = temp[1];
        cube.right[2][0] = temp[2];
    }
    public static void B(Cube cube) {
        rotateClockwise(cube.back);

        char[] temp = new char[3];

        temp[0] = cube.up[0][0];
        temp[1] = cube.up[0][1];
        temp[2] = cube.up[0][2];

        cube.up[0][0] = cube.left[2][0];
        cube.up[0][1] = cube.left[1][0];
        cube.up[0][2] = cube.left[0][0];

        cube.left[2][0] = cube.down[2][2];
        cube.left[1][0] = cube.down[2][1];
        cube.left[0][0] = cube.down[2][0];

        cube.down[2][2] = cube.right[0][2];
        cube.down[2][1] = cube.right[1][2];
        cube.down[2][0] = cube.right[2][2];

        cube.right[0][2] = temp[0];
        cube.right[1][2] = temp[1];
        cube.right[2][2] = temp[2];
    }
}