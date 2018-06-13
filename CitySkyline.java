public class CitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int incr = 0;
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j =0; j < grid[0].length; j++) {
                if(rowMax[i] < grid[i][j]) {
                    rowMax[i] = grid[i][j];
                }
                if(colMax[j] < grid[i][j]) {
                    colMax[j] = grid[i][j];
                }
            }
        }
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                incr += Math.min(rowMax[i],colMax[j]) - grid[i][j];
            }
        }
        return incr;
    }
}
