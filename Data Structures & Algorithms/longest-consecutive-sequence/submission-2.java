class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int len = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int temp = 1;
                while(set.contains(++num)){
                    temp++;
                }
                len = Math.max(len, temp);
                }
        }
        return len;
    }
}
