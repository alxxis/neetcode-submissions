class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.contains(nums[i])){
                return true;
            } else{
                hash.add(nums[i]);
            }
        }
        return false;
    }
}
