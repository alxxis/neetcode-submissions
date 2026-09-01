class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 2){
            return true;
        }
        int front = 0;
        int back = s.length()-1;
        while(front < back){
            while(front < s.length() && front < back && !Character.isLetterOrDigit(s.charAt(front))){
                front++;
            }
            while(back >= 0 && front < back && !Character.isLetterOrDigit(s.charAt(back))){
                back--;
            }
            if(front != back && front < s.length() && back >=0 && Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
