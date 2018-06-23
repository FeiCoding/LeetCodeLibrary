class Solution {
    private int n;
    private int m;
    
    public int numIslands(char[][] grid) {
        n = grid.length;
        if(n == 0) return 0;
        m = grid[0].length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    findIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void findIsland(char[][] grid, int i, int j){
        if(i >= n || j >= m || i < 0 || j < 0 || grid[i][j] != '1') return;
        grid[i][j] = '0';
        findIsland(grid, i - 1, j);
        findIsland(grid, i + 1, j);
        findIsland(grid, i, j - 1);
        findIsland(grid, i, j + 1);
    }
}