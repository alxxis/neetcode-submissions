class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        for(Character c : s.toCharArray()){
            if(stack.contains(c) && (stack.isEmpty() || stack.peek()!=map.get(c)))
                return false;
            else if(!stack.isEmpty() && stack.peek() == map.get(c)){
                stack.pop();
            } else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
