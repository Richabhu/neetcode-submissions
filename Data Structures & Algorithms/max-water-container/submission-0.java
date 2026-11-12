class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length -1; // 7
        int lMax = 0, rMax = 0, max = 0;

        while(l < r) {
            lMax = Math.max(lMax, heights[l]); // 7
            rMax = Math.max(rMax, heights[r]); //6
            int vol = Math.min(lMax, rMax) * (r - l ); // 6 * 
            max = Math.max(max, vol);
            if(lMax < rMax)
                l++; // 2
            else
                r--;
        }

        return max;
    }
}
