class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] arrFreq= new ArrayList[nums.length];
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        for(int i = 0; i < arrFreq.length; i++){
            arrFreq[i] = new ArrayList<>();
        }

        for(int num: freqMap.keySet()){
            arrFreq[freqMap.get(num)-1].add(num);
        }

        int[] ans = new int[k];
        int kLeft = k;
        int i = arrFreq.length-1;
        int ansInd = 0;
        while(kLeft > 0){
            while(!arrFreq[i].isEmpty()){
                ans[ansInd] = arrFreq[i].get(0);
                arrFreq[i].remove(0);
                ansInd++;
                kLeft--;
            }
            i--;
        }
        return ans;
    }
}
