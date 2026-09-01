class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int l = 0; 
        int r = rowLength*colLength-1;
        while ( l <= r){
            int m = (r-l)/2 + l;
            int i = m/colLength;
            int j = m%colLength;
            if(target > matrix[i][j]){
                l = m+1;
            } else if(target < matrix[i][j]){
                r = m-1;
            } else{
                return true;
            }
        }
        return false;
    }
}
