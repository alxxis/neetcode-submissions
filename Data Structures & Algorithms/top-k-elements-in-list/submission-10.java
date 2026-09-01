class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value, frequency
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1]; // frequency, value
        int[] ans = new int[k];
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else
                map.put(num, 1);
        }
        for(int i = 0; i < arr.length; i++)
            arr[i] = new ArrayList<>();
        for(Integer num : map.keySet()){
            arr[map.get(num)].add(num);
        }
        int j = k;
        int backind = arr.length-1;
        int ind = 0;
        while(j > 0){
            if(!arr[backind].isEmpty()){
                for(int num: arr[backind]){
                    ans[ind] = num;
                    ind++;
                    j--;
                }
            }
            backind--;
        }
        return ans;
    }
}
