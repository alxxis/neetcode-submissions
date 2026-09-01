class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c : tokens){
            if(c.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if(c.equals("*")){
                stack.push(stack.pop() *stack.pop());
            } else if (c.equals("-")){
                int a = stack.pop();
                stack.push(stack.pop()-a);
            } else if (c.equals("/")){
                int a = stack.pop();
                stack.push(stack.pop()/a);
            } else stack.push(Integer.parseInt(c));
        }
        return stack.pop();
    }
}
