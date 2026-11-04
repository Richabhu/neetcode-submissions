class Solution {
    public int maxProfit(int[] prices) {

        int memo[][] = new int[prices.length][2];
        for(int i[]: memo)
            Arrays.fill(i, -1);
        return dfs(0, false, prices, memo);
    }

    public int dfs(int i, boolean bought, int []prices, int memo[][]) {
        if(i == prices.length)
            return 0;
        int var = 0;
        if(bought)
            var = 1;
        if(memo[i][var] != -1)
            return memo[i][var];

        int ignore = dfs(i+1, bought, prices, memo);
        int take = 0;
        if(bought) {
            var = 1;
            take = prices[i] + dfs(i+1, false, prices, memo); // sell
        } else {
            var = 0;
            take = -prices[i] + dfs(i+1, true, prices, memo); // buy
        }
            
        return memo[i][var] = Math.max(take, ignore);
    }
}