class Solution {
    public int maxProfit(int[] prices) {
        // min = 1, max = 6

        /*

            buy = 7, sell = 7
            p = s - b
            buy = 4
            sell= 4

        */

        int buy = prices[0], sell = prices[0];
        int profit = 0, sellInd = 0, costInd = 0;

        for(int i = 0; i<prices.length; i++) {

            int cost = prices[i];

            if(cost > sell) {
                sell = cost;
                
            }  
            else {
                profit += sell - buy;
                sell = cost;
                buy = cost;
            }
        }
        profit += sell - buy;
        return profit;
    }

    
}