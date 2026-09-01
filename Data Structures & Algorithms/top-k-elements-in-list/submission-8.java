class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap of values and count
        //create array of values with index of count
        //iterate array backwards
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>[] ans = new ArrayList[nums.length+1];
        
        for(int i = 0; i < ans.length; i++){
            ans[i] = new ArrayList<>();
        }
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans[entry.getValue()].add(entry.getKey());
        }

        int[] arr = new int[k];
        int index = 0;
        for(int i = ans.length-1; i >= 0 && k > 0; i--){
            for(int num : ans[i]){
                arr[index] = num;
                index++;
                k--;
            }
        }
        return arr;
    }
}
