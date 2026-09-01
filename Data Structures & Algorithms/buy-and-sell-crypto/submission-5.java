class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int l = 0;
        int r = 1;
        int maxPrice = 0;
        while(r < prices.length){
            if(prices[r]-prices[l] > maxPrice){
                maxPrice = prices[r]-prices[l];
            }
            if(prices[r] < prices[l]) l = r;
            r++;
        }
        return maxPrice;
    }
}
