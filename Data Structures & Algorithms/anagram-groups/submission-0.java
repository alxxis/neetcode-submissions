class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            List<List<String>> ans = new ArrayList<>();
            return ans;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            } else{
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(s, newList);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> strList : map.values()){
            list.add(strList);
        }
        return list;
    }
}
