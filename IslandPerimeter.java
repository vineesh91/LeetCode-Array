
public class IslandPerimeter {
    int[][] grid;
    int per = 0;
    public int islandPerimeter(int[][] grid1) {
        grid = grid1;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    per += calc(i,j);
                }
            }
        }
        return per;
    }
    private int calc(int a, int b) {
        int area = 0;
        if(a> 0) {
            if (grid[a - 1][b] == 0) {
                area++;
            }
        }
        if(b > 0) {
            if (grid[a][b - 1] == 0) {
                area++;
            }
        }
        if(a < grid.length-1) {
            if (grid[a + 1][b] == 0) {
                area++;
            }
        }
        if(b < grid[0].length-1) {
            if (grid[a][b + 1] == 0) {
                area++;
            }
        }
        if(a == 0 || a == grid.length-1) {
            if(a == 0 && a == grid.length-1) {
                area++;
            }
            area++;
        }
        if(b == 0 || b == grid[0].length-1) {
            if(b == 0 && b == grid[0].length-1) {
                area++;
            }
            area++;
        }
        return area;
    }
}
