public class Q4 {
    private char[][][] cube;

    // Constructor to initialize the Rubik's Cube
    public Q4() {
        cube = new char[3][3][3]; // 3x3x3 Rubik's Cube
        // Initialize each cube face with a distinct color
        initializeCube();
    }

    // Method to initialize the Rubik's Cube with distinct colors on each face
    private void initializeCube() {
        char color = 'W'; // Assume 'W' for white
        for (int face = 0; face < 3; face++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cube[face][i][j] = color;
                }
            }
            switch (face) {
                case 0: // Front face
                    color = 'R'; // Red
                    break;
                case 1: // Back face
                    color = 'O'; // Orange
                    break;
                case 2: // Left face
                    color = 'G'; // Green
                    break;
                case 3: // Right face
                    color = 'B'; // Blue
                    break;
                case 4: // Top face
                    color = 'Y'; // Yellow
                    break;
                case 5: // Bottom face
                    color = 'P'; // Purple
                    break;
            }
        }
    }

    // Method to rotate a layer of the Rubik's Cube
    public void rotateLayer(int layer, boolean clockwise) {
        char[][] temp = new char[3][3]; // Temporary array to store the layer being rotated

        // Copy the layer to temporary array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][j] = cube[layer][i][j];
            }
        }

        // Rotate the layer clockwise or counterclockwise
        if (clockwise) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cube[layer][i][j] = temp[2 - j][i];
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cube[layer][i][j] = temp[j][2 - i];
                }
            }
        }
    }

    // Method to display the current state of the Rubik's Cube
    public void displayCube() {
        for (int face = 0; face < 3; face++) {
            System.out.println("Face " + (face + 1) + ":");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(cube[face][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q4 cube = new Q4();
        System.out.println("Original Rubik's Cube:");
        cube.displayCube();
        cube.rotateLayer(0, true); // Rotate front layer clockwise
        System.out.println("Rubik's Cube after rotating front layer clockwise:");
        cube.displayCube();
    }
}
