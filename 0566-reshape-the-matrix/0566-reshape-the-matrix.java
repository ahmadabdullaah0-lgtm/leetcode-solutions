class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int columns = mat[0].length;
        if (rows * columns != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                result[k / c][k % c] = mat[i][j];
                k++;
            }
        }

        return result;
    }
}