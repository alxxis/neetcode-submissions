class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length==0){
            int[] arr = new int[2];
            return arr;
        }
        int p1 = 0;
        int p2 = numbers.length-1;
        int[] ans = new int[2];
        boolean checkedBehind = true;
        while(p2 < numbers.length){
            int add = numbers[p1] + numbers[p2];
            if(add > target){
                p2--;
            } else if(add < target){
                p1++;
            } else{
                ans[0] = ++p1;
                ans[1] = ++p2;
                return ans;
            }
        }
        return ans;
    }
}
