class Solution 
{
    HashMap<Integer, Integer> cache = new HashMap<>();
    
    public int fib(int n) 
    {
        cache.put(0,0);
        cache.put(1,1);
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
