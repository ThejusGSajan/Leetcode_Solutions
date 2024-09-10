class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_window = 0, num_zeroes = 0;
        int window;
        int l = 0, r = 0;
        int n = nums.length;
        for (r = 0; r < n; r++)
        {
            if(nums[r] == 0)
                num_zeroes++;
            while(num_zeroes > k)
            {
                if(nums[l] == 0)
                    num_zeroes--;
                l++;
            }
            window = r-l+1;
            max_window = Math.max(max_window, window);
        }
        return max_window;
    }
}
