class Solution {
    public int[][] transpose(int[][] matrix) {
        int i,j;
        int row=matrix.length;
        int column=matrix[0].length;
        int[][] transpose=new int[column][row];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                transpose[j][i]=matrix[i][j];    
            }
        }
        return transpose;
        
    }

}