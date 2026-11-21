class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, max = 0, maxF = 0;

        Map<Character, Integer> countMap = new HashMap<>();
        while(r < s.length()) {

            countMap.put(s.charAt(r) , countMap.getOrDefault(s.charAt(r), 0) + 1);

            maxF = Math.max(maxF, countMap.get(s.charAt(r)));
               
            while( (r - l + 1) - maxF > k) {
                countMap.put(s.charAt(l) , countMap.get(s.charAt(l)) - 1);
                l++;
            }

            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
}
