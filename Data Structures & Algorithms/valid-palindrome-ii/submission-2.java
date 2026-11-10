class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length()-1;
        boolean flag = false;
        while(l <= r) {

            while( l<r && !isAlphaNumeric(s.charAt(l))) {
                l++;
            }
            while( l<r && !isAlphaNumeric(s.charAt(r))) {
                r--;
            }

            if(s.charAt(l) != s.charAt(r))
            {
                return isPalindrome(s.substring(0, l) + s.substring(l+1)) || 
                isPalindrome(s.substring(0, r) + s.substring(r+1)) ; 
            }
            l++;
            r--;

        }
        return true;
    }

    boolean isAlphaNumeric(char c) {
        return (((c >= 'a') && (c <= 'z') ) || ( (c >= 'A') && (c <= 'Z') ) || ((c >= '0') && (c <= '9') ));

    }


    boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while(l < r) {
            while( l<r && !isAlphaNumeric(s.charAt(l))) {
                l++;
            }
            while( l<r && !isAlphaNumeric(s.charAt(r))) {
                r--;
            }

            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
         
    }
}