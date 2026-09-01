class Solution {
    public boolean isValid(String s) {
        //if stack is empty && closing parenthesis
            //return false
        //if not empty and matches
            //pop
        //else put
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        for(Character c : s.toCharArray()){
            if(!stack.isEmpty() && map.containsKey(stack.peek())) return false;
            else if(!stack.isEmpty() && stack.peek() == map.get(c)) stack.pop();
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}
