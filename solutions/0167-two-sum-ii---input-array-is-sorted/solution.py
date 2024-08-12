class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        i, n = 0, len(numbers)-1

        while(i != n):
            check = numbers[i]+numbers[n]
            if check == target:
                return [i+1,n+1]
                return res
            elif check > target:
                n -= 1
            else:
                i += 1
        
