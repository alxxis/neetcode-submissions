class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(min.isEmpty() || min.peek() >= val) min.push(val);
        stack.push(val);
    }
    
    public void pop() {
        int num = stack.pop();
        if(num <= min.peek()) min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
