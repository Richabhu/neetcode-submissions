class Solution {
    public int maxProfit(int[] prices) {
        int r = 0; 
        int min = prices[r], max = prices[r];
        int sum = 0;

        while(r<prices.length) {
            if(prices[r] < min) { // 1
                sum = Math.max(sum, max - min);
                min = prices[r]; //1
                max = prices[r];
                
            } else {
                max = Math.max(max, prices[r]);  // 7
            }
            r++;
        }
        sum = Math.max(sum, max- min);
        return sum;

        /*



        */

    }
}
