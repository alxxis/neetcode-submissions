class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length < 1) return 0;
        Stack<Integer> stack = new Stack<>();
        for(String str : tokens){
            if(str.equals("+")) stack.push(stack.pop() + stack.pop());
            else if (str.equals("*")) stack.push(stack.pop()*stack.pop());
            else if (str.equals("-")){
                int temp = stack.pop();
                stack.push(stack.pop()-temp);
            } else if (str.equals("/")){
                int temp = stack.pop();
                stack.push(stack.pop()/temp);
            } else stack.push(Integer.parseInt(str));
        }
        return stack.pop();
    }
}
