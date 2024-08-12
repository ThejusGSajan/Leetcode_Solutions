class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        l1, l2 = len(s), len(t)
        i = j = 0
        if l1 > l2:
            return False
        if s == "":
            return True
        while i < l1 and j < l2:
            if s[i] == t[j]:
                i += 1
                j += 1
            else:
                j += 1
        if i == l1:
            return True
        return False
        
