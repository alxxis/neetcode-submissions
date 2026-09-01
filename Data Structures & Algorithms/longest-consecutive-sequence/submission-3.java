class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        int maxCount = 0;
        int count = 1;
        for(int num: set){
            int number = num;
            while(set.contains(number+1)){
                count++;
                number++;
            }
            if(count > maxCount) maxCount = count;
            count =1;
        }
        return maxCount;
    }
}
