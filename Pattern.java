public class Pattern {
    public static void main(String[] args) {
        int[][] ray = new int[5][5];

        // Fill the 2D array with a triangular pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                ray[i][j] = 1; // 1 represents a star
            }
        }

        // Print the 2D array pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ray[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Empty space
                }
            }
            System.out.println();
        }
    }
}
