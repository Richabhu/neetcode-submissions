class Solution {
    public int characterReplacement(String s, int k) {
        int l =0 , r = 0;
        int max = 0;

        while(l < s.length()) {
            // int count = 0;
            char ch = s.charAt(l);
            r = l+1;
            int temp = k;
            int newL = l+1;
            while(r < s.length() && (s.charAt(r) == ch || temp > 0) ) {
                if(s.charAt(r) != ch) {
                    
                    if(temp == k)
                        newL = r;
                    temp--;      
                }   
                r++;
            }
            int count = r-l;
            if(temp != 0) {
                count+=temp;
            }
            count = Math.min(count, s.length());
            max = Math.max(max, count);
            l = newL;

        }
        return max;
    }
}
