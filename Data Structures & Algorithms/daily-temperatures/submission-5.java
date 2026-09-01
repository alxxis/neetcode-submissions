class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            int[] arr = new int[]{temperatures[i], i};
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
                int[] num = stack.pop();
                ans[num[1]] = i-num[1];
            }
            stack.push(arr);
        }
        return ans;
    }
}
