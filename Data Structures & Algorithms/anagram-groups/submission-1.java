class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<List<String>> ans = new ArrayList<List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] alpha = strs[i].toCharArray();
            Arrays.sort(alpha);
            String str = new String(alpha);
            System.out.println(alpha);
            if(map.containsKey(str)){
                ans.get(map.get(str)).add(strs[i]);
            } else{
                List<String> newList = new ArrayList<String>();
                newList.add(strs[i]);
                ans.add(newList);
                map.put(str, ans.size()-1);
                for(String chararr : map.keySet()){
                    System.out.println(chararr + " " +map.get(chararr));
                }
            }
        }
        return ans;
    }
}
