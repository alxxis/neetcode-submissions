class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = nums[i-1]* arr[i-1];
        }
        int temp = 1;
        for(int j = arr.length-1; j >= 0; j--){
            arr[j] *= temp;
            temp *= nums[j];
        }
        return arr;
    }
}  
