class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String stri : strs){
            str.append(stri.length()).append("#").append(stri);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            int start = i;
            while(str.charAt(i)!='#'){
                i++;
            }
            int num = Integer.parseInt(str.substring(start, i));
            ans.add(str.substring(i+1, i+num+1));
            i+=num;
        }
        return ans;
    }
}
