class Solution {
    public void gameOfLife(int[][] board) {
        if(board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                int lives = countLive(board, i, j);
                if(board[i][j] == 1 && lives >= 2 && lives <= 3)
                    board[i][j] = 3;
                if(board[i][j] == 0 && lives == 3)
                    board[i][j] = 2;
            }
            
        }
        
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                board[i][j] >>= 1;
            }
        }
    }
    
    private int countLive(int [][]board, int i, int j){
        int count = 0;
        for(int a = Math.max(i - 1, 0); a <= Math.min(i + 1, board.length - 1); ++a){
            for(int b = Math.max(j - 1, 0); b <= Math.min(j + 1, board[0].length - 1); ++b){
                count += board[a][b] & 1;
            }
        }
        count -= board[i][j] & 1;
        return count;
    }
}