class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean check[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!check[i][j] && grid[i][j] == '1') {
                    check(grid, check, j, i);
                    count++;
                }
            }
        }
        return count;

    }
    // public void bfs(int grid[][],boolean check[][],int i,int j){

    // }
    public static void check(char grid[][], boolean check[][], int c, int r) {
        if (c >= grid[0].length || r >= grid.length) {
            return;
        }
         if (c < 0 || r < 0||grid[r][c]=='0') {
            return;
        }
        if (grid[r][c] == '1' && check[r][c] == false) {
            check[r][c] = true;
        }
        if (r - 1 >= 0 && grid[r - 1][c] =='1' && check[r - 1][c] == false) {
            check[r - 1][c] = true;
            check(grid, check, c, r - 1);
        }
        if (c - 1 >= 0 && grid[r][c - 1] == '1' && check[r][c - 1] == false) {
            check[r][c - 1] = true;
            check(grid, check, c - 1, r);

        }
        if (r + 1 < grid.length && grid[r + 1][c] =='1' && check[r + 1][c] == false) {
            check[r + 1][c] = true;
            check(grid, check, c, r + 1);

        }
        if (c + 1 < grid[0].length && grid[r][c + 1] == '1' && check[r][c + 1] == false) {
            check[r][c + 1] = true;
            check(grid, check, c + 1, r);
        }
    }
}