class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2){
            return s.length();
        }
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 1;
        int max = 0;
        set.add(s.charAt(l));
        while(r < s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}
