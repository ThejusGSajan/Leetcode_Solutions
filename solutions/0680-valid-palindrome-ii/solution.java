class Solution {
    public boolean validPalindrome(String s) {
        int length = s.length();
        int l = 0;
        int r = length - 1;
        while(l <= r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                if(isPal(s.substring(l+1,r+1)) || isPal(s.substring(l,r)))
                    return true;
                else
                    return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isPal(String s)
    {
        int length = s.length();
        int l = 0;
        int r = length - 1;
        while(l <= r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
