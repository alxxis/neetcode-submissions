class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        int num = stack.pop();
        if(!minStack.isEmpty() && num==minStack.peek())
            minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
