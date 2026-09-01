class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String st: strs){
            ans+=st + ".";
        }
        return ans;
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;
        String st = "";
        for(Character c: str.toCharArray()){
            if(c!='.') st+=c;
            else{
                ans.add(st);
                st = "";
            }
        }
        return ans;
    }
}
