class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length==2){
            return new int[] {1,2};
        }
        int front = 0;
        int back = numbers.length-1;
        while(front < back){
            if(numbers[front]+ numbers[back] == target){
                return new int[] {front+1, back+1};
            }
            if(numbers[front] + numbers[back] < target){
                front++;
            } else{
                back--;
            }
        }
        return new int[] {};
    }
}
