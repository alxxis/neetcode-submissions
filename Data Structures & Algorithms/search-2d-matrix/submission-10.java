class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0; 
        int r = matrix[0].length*matrix.length-1;
        while(l <=r){
            int mid = (r-l)/2+l;
            if(target==matrix[mid/matrix[0].length][mid%matrix[0].length])return true;
            else if(target>matrix[mid/matrix[0].length][mid%matrix[0].length]) l = mid+1;
            else r= mid-1;
        }
        return false;
    }
}
