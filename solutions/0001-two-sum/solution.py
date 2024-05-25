class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashMap = {}
        for i, num in enumerate(nums):
            sub_target = target - num
            if sub_target in hashMap:
                return [i, hashMap[sub_target]]
            hashMap[num] = i
        return []
