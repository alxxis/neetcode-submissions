class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(int i = 0; i < strs.size(); i++){
            str+=strs.get(i).length() + "#" + strs.get(i);
        }
        return str;
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> arr = new ArrayList<>();
        while (i < str.length()){
            System.out.println(i);
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            System.out.println(j);
            int len = Integer.parseInt(str.substring(i, j))+j;
            System.out.println(len);
            arr.add(str.substring(j+1, len+1));
            i =len+1;
        }
        return arr;
    }
}
