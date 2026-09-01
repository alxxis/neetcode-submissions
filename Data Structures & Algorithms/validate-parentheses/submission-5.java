class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && map.containsKey(stack.peek()) && s.charAt(i) == map.get(stack.peek())){
                stack.pop();
            } else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
