class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")){
                int a = stack.pop();
                stack.push(stack.pop()-a);
            } else if (s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            } else if(s.equals("/")){
                int a = stack.pop();
                stack.push(stack.pop()/a);
            } else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
