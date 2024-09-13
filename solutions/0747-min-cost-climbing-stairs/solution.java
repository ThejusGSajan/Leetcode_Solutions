class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length, i;
        int ans[] = new int[n];
        ans[0] = 0;
        ans[1] = 0;
        for(i = 2; i < n; i++)
        {
            ans[i] = Math.min(ans[i-1]+cost[i-1], ans[i-2]+cost[i-2]);
        }
        return Math.min(ans[n-1]+cost[n-1],ans[n-2]+cost[n-2]);
    }
}
