class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // Iterate through each row starting from the second row
        for (int i = 1; i < matrix.length; i++) {
            // Iterate through each column starting from the second column
            for (int j = 1; j < matrix[0].length; j++) {
                // If current element doesn't match the one diagonally above-left
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        // If no mismatches found, it's a Toeplitz matrix
        return true;
    }
}
