public class number_spiral {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 5;
        int k = 0;
        int consecutive = 1;
        int i = 0;
        int j = 0;
        int[][] spiral = new int[rows][cols];

        while (consecutive < (rows * cols)) {
            while (j < (cols - 1 - k)) {
                spiral[i][j] = consecutive;
                j++;
                consecutive++;
            }
            while (i < (rows - 1 - k)) {
                spiral[i][j] = consecutive;
                i++;
                consecutive++;
            }
            while (j > 0 + k) {
                spiral[i][j] = consecutive;
                j--;
                consecutive++;
            }
            while (i > 0 + k) {
                spiral[i][j] = consecutive;
                i--;
                consecutive++;
            }
            k++;
            i += 1;
            j += 1;

        }
        spiral[i][j] = consecutive;
        for (int l = 0; l < rows; l++) {
            for (int m = 0; m < cols; m++) {
                System.out.printf("%3d", spiral[l][m]);
            }
            System.out.println();
        }


    }
}
