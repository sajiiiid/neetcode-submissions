class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = 0;
        int r = n -1;
        int toBuy = prices[0];
        int toSell = prices[n -1];
        int maxProfit = 0;
        for (int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int currProfit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, (prices[j] - prices[i]));
            }
        }
        return maxProfit;
    }
}
