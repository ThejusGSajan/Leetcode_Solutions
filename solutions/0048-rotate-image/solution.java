class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp, i , j;
        // taking transpose
        for(i = 0; i < n; i++)
            for(j = i+1; j < n; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        // flipping horizontally
        int len = n/2;
        for(i = 0; i < n; i++)
            for(j = 0; j < len; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
    }
}
