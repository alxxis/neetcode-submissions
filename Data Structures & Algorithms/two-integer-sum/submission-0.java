class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0 || nums.length==1){
            return new int[] {};
        }
        HashMap<Integer, Integer> map = new HashMap<>(); //int index
        for(int i = 0; i< nums.length; i++){
            if(!map.isEmpty() && map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i};
            } else if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
