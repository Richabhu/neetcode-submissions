class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer str = new StringBuffer();

        int ind1 = 0, ind2 = 0;
        int m = word1.length(), n = word2.length();

        while(ind1 <m && ind2 < n) {
            str.append(word1.charAt(ind1++));
            str.append(word2.charAt(ind2++));
        }

        if(ind1 == m) {
            str.append(word2.substring(ind2));
        } 
        if(ind2 == n) {
            str.append(word1.substring(ind1));
        }
        return str.toString();   
    }
}