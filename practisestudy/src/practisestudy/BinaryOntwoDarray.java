package practisestudy;

import java.util.Arrays;

//BinaryOntwoDarray
public class BinaryOntwoDarray {
    public static int[] binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return new int[]{mid, 0}; // Return position (mid, 0)
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1}; // Element not found
    }

    public static int[] searchElement(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int[] midColumn = new int[m];
        for (int i = 0; i < m; i++) {
            midColumn[i] = matrix[i][n / 2]; // Extract middle column
        }
        int[] midResult = binarySearch(midColumn, target); // Binary search on middle column
        if (midResult[0] != -1) {
            return new int[]{midResult[0], n / 2}; // Element found in middle column
        }
        // Divide remaining rows into halves
        int[][] upperHalf = new int[m / 2][n];
        int[][] lowerHalf = new int[m - m / 2][n];
        for (int i = 0; i < m / 2; i++) {
            upperHalf[i] = Arrays.copyOfRange(matrix[i], 0, n);
        }
        for (int i = m / 2; i < m; i++) {
            lowerHalf[i - m / 2] = Arrays.copyOfRange(matrix[i], 0, n);
        }
        if (target < midColumn[midColumn.length / 2]) {
            return searchElement(upperHalf, target); // Search in upper half
        } else {
            return searchElement(lowerHalf, target); // Search in lower half
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 3;
        int[] result = searchElement(matrix, target);
        if (result[0] != -1) {
            System.out.println("Element found at position: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found.");
        }
    }
}
