class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        int maxCount = 0;
        int count = 1;
        for(int num: set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)) length++;
                maxCount = Math.max(maxCount, length);
            }
        }
        return maxCount;
    }
}
