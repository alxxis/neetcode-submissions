class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1){
            return new int[] {0};
        }
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i < nums.length; i++){
            arr[i] = nums[i-1]*arr[i-1];
        }
        int postfix = 1;
        for(int i = nums.length-1; i >=0; i--){
            arr[i] *=postfix;
            postfix *=nums[i];
        }
        return arr;
    }
}  
