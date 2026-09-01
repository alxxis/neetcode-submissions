class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
                ans[stack.peek()[1]] = i-stack.peek()[1];
                stack.pop();
            }
            stack.push(new int[]{temperatures[i], i});
        }
        while(!stack.isEmpty()){
            ans[stack.pop()[1]] = 0;
        }
        return ans;
    }
}
