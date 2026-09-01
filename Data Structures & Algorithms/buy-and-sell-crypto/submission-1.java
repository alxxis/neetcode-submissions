class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int k = 0;
        for(int i = 1; i < prices.length; i++){
            if(max < prices[i]-prices[k]){
                max = prices[i]-prices[k];
            }
            if(prices[i] < prices[k]){
                k = i;
            }
        }
        return max;
    }
}
