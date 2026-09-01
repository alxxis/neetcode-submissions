class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        ans.add(subset);
        for(int num: nums){
            int size = ans.size();
            for(int i = 0; i < size; i++){
                ArrayList<Integer> addedArr = new ArrayList<>(ans.get(i));
                addedArr.add(num);
                ans.add(addedArr);
            }
        }
        return ans;
    }
}
