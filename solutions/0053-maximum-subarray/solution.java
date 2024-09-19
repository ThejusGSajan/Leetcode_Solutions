class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum = 0;
        int max_sum = nums[0];
        for(int i : nums)
        {
            cur_sum += i;
            max_sum = max_sum > cur_sum ? max_sum : cur_sum;
            if(cur_sum < 0)
                cur_sum = 0;
        }

        return max_sum;
    }
}
