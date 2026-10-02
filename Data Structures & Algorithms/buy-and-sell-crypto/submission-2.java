class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int toBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++){
            toBuy = Math.min(toBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - toBuy);
        }
        return maxProfit;
    }
}
