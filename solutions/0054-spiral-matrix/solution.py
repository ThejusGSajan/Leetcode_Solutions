class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ans = []
        i,j = 0,0
        right, down, left, up = 0, 1, 2, 3
        row = len(matrix)
        col = len(matrix[0])
        right_wall, down_wall, left_wall, up_wall = col, row, -1, 0

        direction = right
        
        while len(ans) != row*col:
            if direction == right:
                while j < right_wall:
                    ans.append(matrix[i][j])
                    j += 1
                direction = down
                i += 1
                j -= 1
                right_wall -= 1
            elif direction == down:
                while i < down_wall:
                    ans.append(matrix[i][j])
                    i += 1
                direction = left
                i -= 1
                j -= 1
                down_wall -= 1
            elif direction == left:
                while j > left_wall:
                    ans.append(matrix[i][j])
                    j -= 1
                direction = up
                i -= 1
                j += 1
                left_wall += 1
            else:
                while i > up_wall:
                    ans.append(matrix[i][j])
                    i -= 1
                direction = right
                i += 1
                j += 1
                up_wall += 1
        
        return ans
                
