class Solution {
    public boolean isPalindrome(String s) {
        // applying the constraint of lowercase alphanumeric chars 
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-zA-Z]", "");

        int length = s.length();
        char temp;
        int l = 0;
        int r = length - 1;
        
        while(l <= r)
        {
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
