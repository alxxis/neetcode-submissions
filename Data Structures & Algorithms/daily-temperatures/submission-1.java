class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                    int ind = stack.pop()[1];
                    arr[ind] = i-ind;
                }
            stack.push(new int[] {temperatures[i], i});
        }
        return arr;
    }
}
