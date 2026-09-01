class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>(); // val, count
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] ans = new int[k];
        int j = freq.length;
        int l = 0;
        while(k > 0){
            j--;
            while(freq[j].size()==0){
                j--;
            }
            for(int i = 0; i < freq[j].size(); i++){
                ans[l] = freq[j].get(i);
                l++;
                k--;
            }
        }
        return ans;
    }
}
