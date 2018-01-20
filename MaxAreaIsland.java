public class MaxAreaIsland {
    int[][] grid;
    int[][] flag;
    public int maxAreaOfIsland(int[][] grid1) {
        grid = grid1;
        flag = new int[grid.length][grid[0].length];
        int max  = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int area = calc(i,j);
                if(area > max) {
                    max = area;
                }
            }
        }
        return max;
    }

    public int calc(int a, int b) {
        if(a >= 0 && b >= 0 && a < grid.length && b < grid[0].length) {
            if(flag[a][b] == 0 && grid[a][b] == 1) {
                flag[a][b] = 1;
                int area = calc(a + 1, b) + calc(a - 1, b) + calc(a, b - 1) + calc(a, b + 1) + 1;
                return area;
            }
            else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }
}
