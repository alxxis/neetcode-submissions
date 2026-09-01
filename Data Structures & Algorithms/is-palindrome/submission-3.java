class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        int front = 0;
        int back = s.length()-1;
        while(front <= back){
            while(front<s.length()-1 && !Character.isLetterOrDigit(s.charAt(front))){
                front++;
            }
            while(back>0 && !Character.isLetterOrDigit(s.charAt(back))){
                back--;
            }
            if(front <= back && Character.toLowerCase(s.charAt(front))!=Character.toLowerCase(s.charAt(back))){
                System.out.println(s.charAt(front) + " " + s.charAt(back));
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
