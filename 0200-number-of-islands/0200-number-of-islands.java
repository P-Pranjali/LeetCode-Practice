class Solution {
    
    int  count = 0;

    public int numIslands(char[][] grid) {
for (int row =0; row <= grid.length - 1; row++){
    for (int col = 0; col <= grid[0].length - 1; col++){
        if (grid[row][col] == '1'){
            dfs(grid, row, col);
            count++;
        }    
}   
    }
     return count;
    }
  public  void dfs(char[][] grid, int row, int col){
        //int count = 0;

        if(row < 0 || row >= grid.length) return;
        if(col < 0 || col >= grid[0].length) return;
        if(grid[row][col] == '0')return;

        if(grid[row][col] == '1') {
            grid[row][col] = '0';
           }

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);

       
        
    }
}