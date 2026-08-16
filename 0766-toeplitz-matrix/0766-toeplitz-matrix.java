class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows=matrix.length;
        int column=matrix[0].length;
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<column;j++)
            {
                if(matrix[i][j]!=matrix[i-1][j-1])
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}