class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i ++){
            Set<Character> row = new HashSet<Character>();
            Set<Character> col = new HashSet<Character>();
            Set<Character> subset = new HashSet<Character>();
            for(int j = 0; j < 9; j++){                
                if(board[i][j]!='.' && !row.add(board[i][j]))
                   return false;                
                if(board[j][i]!='.' && !col.add(board[j][i]))
                    return false;
                int subRow = 3*(i/3);
                int subCol = 3*(i%3); // i = 0,1,2, subset start indexes are [0,0][0,3][0,6]
                if(board[subRow + j / 3][subCol + j % 3] != '.' && !subset.add(board[subRow + j / 3][subCol + j % 3]))
                    return false;
            
            }
        }
        return true;
    }
}