class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        l = len(strs)
        min = float('inf')
        for s in strs:
            if(len(s) < min):
                min = len(s)
        first_str = strs[0]

        i = 0
        while i < min:
            for s in strs:
                if(s[i] != first_str[i]):
                    return first_str[0:i]
            i = i+1

        return first_str[0:i]
        
