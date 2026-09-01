class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = nums[i-1]*arr[i-1];
        }
        int temp = 1;
        for(int i = arr.length-1; i >=0; i--){
            arr[i] = temp *arr[i];
            temp*=nums[i];
        }
        return arr;
    }
}  
