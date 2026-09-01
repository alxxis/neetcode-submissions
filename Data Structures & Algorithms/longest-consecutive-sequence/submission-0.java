class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int ans = 0;
        for(int num : nums){
            int temp = 1;
            int check = num;
            while(set.contains(check+1)){
                temp++;
                check++;
            }
            ans = Math.max(temp, ans);
        }
        return ans;
    }
}
