class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0; int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while(l <= r){
            int mid = (r-l)/2 +l;
            long totalTime = 0;
            for(int p : piles){
                totalTime+=Math.ceil((double) p/mid);
            }
            if(totalTime <= h){
                ans = mid;
                r = mid-1;
            } else l = mid+1;
        }
        return ans;
    }
}
