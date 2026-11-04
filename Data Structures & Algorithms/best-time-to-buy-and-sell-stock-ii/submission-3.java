class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int memo[][] = new int[n][n];
        for(int i[]: memo)
            Arrays.fill(i, -1);
        return dfs(0, 0, prices, memo);
    }

    int dfs(int buyInd, int sellInd, int prices[], int memo[][]) {

        if(sellInd == prices.length -1 )
            return prices[sellInd] - prices[buyInd];

        if(memo[buyInd][sellInd] != -1)
            return memo[buyInd][sellInd];

        
        int take = (prices[sellInd] - prices[buyInd]) + dfs(sellInd + 1, sellInd+1, prices, memo);
        int ignore = dfs(buyInd, sellInd + 1, prices, memo);
        return memo[buyInd][sellInd] = Math.max(take, ignore);
    }
}