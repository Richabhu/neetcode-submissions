class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int l = 0, r = 0, max = 0;
        Map<Character, Integer> arr = new HashMap<>();
        
        while(r < s.length()) {

            char ch = s.charAt(r);

            while(l < r && arr.getOrDefault(ch, 0) == 1) {

                arr.put(s.charAt(l) , arr.get( s.charAt(l)) -1 );
                l++;
            }
            arr.put(ch, arr.getOrDefault(ch, 0) + 1);
            max = Math.max(max, r-l +1);
            r++;
        }
        return max;
    }
}
