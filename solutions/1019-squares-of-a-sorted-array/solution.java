class Solution {
    public int[] sortedSquares(int[] nums) {
        // squaring
        int len = nums.length;
        for(int i = 0; i < len; i++)
            nums[i] = nums[i] * nums[i];
        
        // 2 pointer
        // gs_nums[] gets filled with squares of the numbers in nums[] in
        // decreasing order
        int sq_nums[] = new int[len];
        int l = 0;
        int r = len - 1;
        int index = 0;
        while(l <= r)
        {
            if(nums[l] >= nums[r])
            {
                sq_nums[index++] = nums[l];
                l++;
            }
            else
            {
                sq_nums[index++] = nums[r];
                r--;
            }
        }

        // reversing (to increasing order) using 2 pointer
        l = 0;
        r = len - 1;
        int temp;
        while(l <= r)
        {
            temp = sq_nums[l];
            sq_nums[l] = sq_nums[r];
            sq_nums[r] = temp;
            l++;
            r--;
        }

        return sq_nums;
    }
}
