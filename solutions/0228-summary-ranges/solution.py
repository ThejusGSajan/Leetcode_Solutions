class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        ans = []
        n = len(nums)
        i = 0
        while(i < n):
            start = i
            while(i < n-1 and nums[i] + 1 == nums[i+1]):
                i += 1
            if(start == i):
                ans.append(str(nums[start]))
            else:
                ans.append(str(nums[start])+"->"+str(nums[i]))
            i += 1

        return ans
