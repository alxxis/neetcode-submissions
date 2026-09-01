class Solution {
    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
       Stack<Character> stack = new Stack<>();
       HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(Character c: s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            } else{
                if(stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                } else if(stack.peek() == map.get(c)){
                    stack.pop();
                } else{
                    stack.push(c);
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
