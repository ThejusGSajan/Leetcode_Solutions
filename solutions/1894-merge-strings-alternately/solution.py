class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l1 = len(word1)
        l2 = len(word2)
        i = j = 0
        count1 = count2 = 0
        result = ""
        if l1 < l2:
            for i in range(l1):
                result += word1[i] + word2[i]
                count1 += 1
            for j in range(count1, l2):
                result += word2[j]
        elif l2 < l1:
            for i in range(l2):
                result += word1[i] + word2[i]
                count2 += 1
            for j in range(count2, l1):
                result += word1[j]
        else:
            for i in range(l1):
                result += word1[i] + word2[i]
                
        return result
        
