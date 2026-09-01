class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<String, HashSet<Character>> box = new HashMap<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j]=='.') continue;
                String key = i/3 + " " + j/3;
                if(row.computeIfAbsent(i, k-> new HashSet<>()).contains(board[i][j]) || col.computeIfAbsent(j, k-> new HashSet<>()).contains(board[i][j]) || box.computeIfAbsent(key, k-> new HashSet<>()).contains(board[i][j])) return false;
                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                box.get(key).add(board[i][j]);
            }
        }
        return true;
    }
}
