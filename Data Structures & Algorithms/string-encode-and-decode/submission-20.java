class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(int i = 0; i < strs.size(); i++){
            str+=Integer.toString(strs.get(i).length()) + "#" + strs.get(i);
        }
        System.out.println(str);
        return str;
    }

    public List<String> decode(String str) {
        ArrayList<String> arr = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i+1;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = "";
            i = j+1;
            while(len>0){
                word+=str.charAt(i);
                len--;
                i++;
            }
            arr.add(word);
        }
        return arr;
    }
}
