class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0, avg = 0.0, max = 0.0;
        int n = nums.length;
        int i,j;
        for(i = 0; i < k; i++)
                sum += nums[i];
        avg = sum/k;
        if(n == k)
        {
            return avg;
        }
        for(i = k; i < n; i++)
        {
            sum += nums[i];
            sum -= nums[i-k];
            avg = Math.max(avg, sum/k);
        }
        return avg;
    }
}
