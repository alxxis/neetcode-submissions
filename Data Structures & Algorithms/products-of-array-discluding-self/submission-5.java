class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int[] ans = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1]*nums[i-1];
        }
        int val = 1;
        for(int i = arr.length-1; i >=0; i--){
            ans[i] = arr[i]*val;
            val *= nums[i];
        }
        return ans;
    }
}  
