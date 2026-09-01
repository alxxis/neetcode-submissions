class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str:strs){
            int[] arr = new int[26];
            for(Character c: str.toCharArray()){
                arr[c-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(arr), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
