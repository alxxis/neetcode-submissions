class Solution {
    public int trap(int[] height) {
        int water = 0;
        if(height == null || height.length == 0){
            return 0;
        }
        int l = 0;
        int r = height.length-1;
        int maxL = height[l];
        int maxR = height[r];
        while(l < r){
            if(maxL > maxR){
                r--;
                maxR = Math.max(maxR, height[r]);
                water += maxR - height[r];
            } else{
                l++;
                maxL = Math.max(maxL, height[l]);
                water += maxL - height[l];
            }
        }
        return water;
    }
}
