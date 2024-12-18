package practisestudy;

public class DeterminateOFMatrix {
	public static int determinant(int[][] mat) {
        int n = mat.length;

        // Base case: for 1x1 matrix
        if (n == 1) {
            return mat[0][0];
        }

        int det = 0;
        int sign = 1;

        // Iterate over each element in the first row
        for (int j = 0; j < n; j++) {
            // Calculate the determinant of the submatrix
            int[][] submat = getSubmatrix(mat, 0, j);
            det += sign * mat[0][j] * determinant(submat);
            sign = -sign; // Toggle sign for each element in the row
        }

        return det;
    }

    // Helper method to get submatrix by excluding given row and column
    private static int[][] getSubmatrix(int[][] mat, int rowToRemove, int colToRemove) {
        int n = mat.length;
        int[][] submat = new int[n - 1][n - 1];
        int rowIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) {
                continue;
            }
            int colIndex = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) {
                    continue;
                }
                submat[rowIndex][colIndex] = mat[i][j];
                colIndex++;
            }
            rowIndex++;
        }
        return submat;
    }

    public static void main(String[] args) {
//        int[][] mat = {
//            {1, 2, 3},
//            {1, 3, 4},
//            {1, 4, 3}
//        };
    	 int mat[][] = { { 1, 0, 2, -1 },
                 { 3, 0, 0, 5 },
                 { 2, 1, 4, -3 },
                 { 1, 0, 5, 0 } };

        int determinant = determinant(mat);
        System.out.println("Determinant: " + determinant);
    }
}