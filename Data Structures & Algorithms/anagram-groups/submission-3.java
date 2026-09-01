class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] arr = new int[26];
            for(Character c : s.toCharArray()){
                arr[c-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(arr), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
