class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            int ans = prices[i]-buy;
            if(ans>profit){
                profit = ans;
            }
        }
        return profit;
    }
}