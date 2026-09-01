class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //hashmap of values and frequency
        //array of list<int> represnting the value for each frequency represented by the index
        //have an arraylist and add from back to front
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<Integer>();
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int i = freq.length-1;
        while(i >= 0 && k > 0){
            for(int n : freq[i]){
                ans[k-1] = n;
                k--;
            }
            if(k==0) return ans;
            i--;
        }
        return ans;
    }
}
