public class Ass3Q7 {

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Matrix addition failed. One of the matrices has insufficient dimensions.");
            return null;
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        try {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Matrix multiplication failed. The number of columns in the first matrix must match the number of rows in the second matrix.");
            return null;
        }

        return result;
    }

    //Transpose Matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[j][i] = matrix[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Matrix transposition failed. The matrix is not properly defined.");
            return null;
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null or invalid.");
            return;
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {11, 22, 33},
            {44, 55, 66}
        };

        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] matrix3 = {
            {1, 2},
            {3, 4}
        };

        System.out.println("Matrix Addition:");
        int[][] additionResult = addMatrices(matrix1, matrix3);
        printMatrix(additionResult);
        System.out.println("\nMatrix Multiplication:");
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        printMatrix(multiplicationResult);
        System.out.println("\nMatrix Transpose:");
        int[][] transposeResult = transposeMatrix(matrix1);
        printMatrix(transposeResult);
    }
}