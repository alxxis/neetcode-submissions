class Solution {
    public int[] productExceptSelf(int[] nums) {
        if( nums.length==0){
            return null;
        }
        int[] ans = new int[nums.length];
        int totalProd = nums[0];
        for(int i = 1; i < nums.length; i++){
            totalProd*=nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                ans[i] = totalProd/nums[i];
            } else{
                int product = 1;
                for(int j = 0; j < nums.length; j++){
                    if(j==i){
                        continue;
                    }
                    product*=nums[j];
                }
                ans[i] = product;
            }
        }
        return ans;
    }
}  
