class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> column = new HashMap<>();
        HashMap<String, HashSet<Character>> box = new HashMap<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                //check is in hashmap already
                //if so
                    //return false
                //then just add to the list
                if(board[i][j]=='.')continue;
                int n = i/3;
                int m = j/3;
                String boxKey = n + "" + m;
                if(row.computeIfAbsent(i, s -> new HashSet<>()).contains(board[i][j]) || column.computeIfAbsent(j, s -> new HashSet<>()).contains(board[i][j]) || box.computeIfAbsent(boxKey, s -> new HashSet<>()).contains(board[i][j])){
                    return false;
                }
                row.get(i).add(board[i][j]);
                column.get(j).add(board[i][j]);
                box.get(boxKey).add(board[i][j]);
            }
        }
        return true;
    }
}
