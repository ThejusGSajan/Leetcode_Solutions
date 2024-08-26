class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char temp;
        int l = 0;
        int r = len - 1;
        while(l <= r)
        {
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
