class Solution {
    HashMap<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) 
    {
        cache.put(1,1);
        cache.put(2,2);
        return dp(n);
    }
    public int dp(int n)
    {
        if(cache.containsKey(n))
            return cache.get(n);
        else
        {
            cache.put(n, dp(n-1)+dp(n-2));
            return cache.get(n);
        }
    }
}
