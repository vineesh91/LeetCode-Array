import java.util.ArrayList;
import java.util.List;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] reshaped = new int[r][c];
        if(nums.length * nums[0].length != r * c) {
            return nums;
        }
        List<Integer> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                lst.add(nums[i][j]);
            }
        }
        int k = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                reshaped[i][j] = lst.get(k);
                k++;
            }
        }
        return reshaped;
    }
}
