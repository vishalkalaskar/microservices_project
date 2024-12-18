package practisestudy;

public class Binarytwodoptionsecond {

	public static int binarySearch(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int[] newArray = new int[row * col];
        int index = 0;

        // Flatten the 2D array into a 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArray[index++] = arr[i][j];
            }
        }

        // Binary search in the flattened array
        int low = 0;
        int high = newArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (newArray[mid] == target) {
                index = mid; // Save the index for reconstruction
                break;
            } else if (newArray[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Reconstruct the sorted matrix
        if (low <= high) {
            int i = index / col;
            int j = index % col;
            System.out.println("Element " + target + " found at index (" + i + ", " + j + ")");
            return index;
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
            return -1;
        }
    }

    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 8;
        int result = binarySearch(matrix, target);
        //printMatrix(matrix);
    }
}