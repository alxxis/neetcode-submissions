class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value, index
        for(int i = 0; i < numbers.length; i++){
            if(!map.isEmpty() && map.containsKey(target-numbers[i])) return new int[]{map.get(target-numbers[i])+1, i+1};
            map.put(numbers[i], i);
        }
        return new int[]{};
    }
}
