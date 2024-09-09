class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        int start;
        while(i < n)
        {
            start = i;
            while(i < n-1 && nums[i] + 1 == nums[i+1])
                i++;
            if(i == start)
                ans.add(nums[start]+"");
            else
                ans.add(nums[start]+"->"+nums[i]);
            i++;
        }
        return ans;
    }
}
