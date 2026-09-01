class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> column = new HashMap<>();
        HashMap<String, HashSet<Character>> box = new HashMap<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j]=='.') continue;
                String boxKey = i/3 + " " + j/3;
                if(row.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) || column.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) || box.computeIfAbsent(boxKey, k -> new HashSet<>()).contains(board[i][j])) return false;

                row.get(i).add(board[i][j]);
                column.get(j).add(board[i][j]);
                box.get(boxKey).add(board[i][j]);
            }
        }
        return true;
    }
}
