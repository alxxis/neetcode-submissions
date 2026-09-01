class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int l = 0;
        int r = heights.length-1;
        while(l <r){
            int height;
            if(heights[l]<heights[r])height = heights[l];
            else height = heights[r];
            max = Math.max(max, height*(r-l));
            if(heights[l]<heights[r])l++;
            else r--;
        }
        return max;
    }
}
