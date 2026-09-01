class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> column = new HashMap<>();
        HashMap<String, HashSet<Character>> box = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                String key = (i/3) + " " + (j/3);
                if(row.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) || column.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) || box.computeIfAbsent(key, k -> new HashSet<>()).contains(board[i][j]))  return false;
                row.putIfAbsent(i, new HashSet<Character>());
                row.get(i).add(board[i][j]);
                column.putIfAbsent(j, new HashSet<Character>());
                column.get(j).add(board[i][j]);
                box.putIfAbsent(key, new HashSet<Character>());
                box.get(key).add(board[i][j]);
                System.out.println(i + " " + j);
            }
        }
        return true;
    }
}
