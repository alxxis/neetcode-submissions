class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        while (i < j){
            int mid = (j-i)/2+i;
            if(nums[mid] < target){
                i = mid+1;
            } else if(nums[mid] > target){
                j = mid;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
