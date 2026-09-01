class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            int k = (j-i)/2 + i;
            if(nums[k] < target){
                i = k+1;
            } else if (nums[k] > target){
                j = k-1;
            } else return k;
        }
        return -1;
    }
}
