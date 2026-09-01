class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(Character c : str.toCharArray()){
                count[c-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(count), k -> new ArrayList<>());
            map.get(Arrays.toString(count)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
