class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int right = 0, down = 1, left = 2, up = 3;
        int direction;

        int row = matrix.length;
        int col = matrix[0].length;

        int right_wall = col, down_wall = row, left_wall = -1, up_wall = 0; 
        
        List<Integer> ans = new ArrayList<>();

        direction = right;

        int i = 0, j = 0;

        while(ans.size() < row*col)
        {
            if (direction == right)
            {
                while(j < right_wall)
                {
                    ans.add(matrix[i][j]);
                    j++;
                }
                direction = down;
                i++;
                j--;
                right_wall--;
            }
            else if(direction == down)
            {
                while(i < down_wall)
                {
                    ans.add(matrix[i][j]);
                    i++;
                }
                direction = left;
                i--;
                j--;
                down_wall--;
            }
            else if(direction == left)
            {
                while(j > left_wall)
                {
                    ans.add(matrix[i][j]);
                    j--;
                }
                direction = up;
                i--;
                j++;
                left_wall++;
            }
            else
            {
                while(i > up_wall)
                {
                    ans.add(matrix[i][j]);
                    i--;
                }
                direction = right;
                i++;
                j++;
                up_wall++;
            }
        }

        return ans;
    }
}
