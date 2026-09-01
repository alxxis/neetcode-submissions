class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>(); //number, amount
        for(int i = 0; i < arr.length; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            arr[entry.getValue()].add(entry.getKey());
        }
        int[] ans = new int[k];
        int ind = 0;
        for(int i = arr.length-1; i >=0 && k >0; i--){
            for(int num: arr[i]){
                ans[ind] = num;
                ind++;
                k--;
            }
        }
        return ans;
    }
}
