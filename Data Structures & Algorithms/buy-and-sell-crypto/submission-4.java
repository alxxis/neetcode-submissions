class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        while(r < prices.length){
            while(r < prices.length && prices[r]>=prices[l]){
                max = Math.max(max, prices[r]-prices[l]);
                r++;
            }
            l = r;
            r++;
        }
        return max;
    }
}
