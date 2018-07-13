class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[0].length; j ++){
                return exist(board, word, i, j, 0);
            }
        }
        return false;
    }
    
    public boolean exist(char[][] board, String word, int x, int y, int index){
        if(index >= word.length()) return true;
        if(x < 0 || x >= board.length || y >= board[0].length || y < 0) return false;
        if(board[x][y] == word.charAt(index++)){
            char c = board[x][y];
            board[x][y] = '#';
            boolean res = exist(board, word, x + 1, y, index) ||
                exist(board, word, x - 1, y, index) ||
                exist(board, word, x, y + 1, index) ||
                exist(board, word, x, y - 1, index);
            board[x][y] = c;
            return res;
        }
        return false;
    }
}