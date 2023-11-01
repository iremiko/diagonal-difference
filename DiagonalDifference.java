public class DiagonalDifference {
    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][n - 1 - i];
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {7, 8, 9},
                {4, 5, 6},
                {3, 2, 1}
        };

        int result = diagonalDifference(matrix);
        System.out.println(result);
    }
}