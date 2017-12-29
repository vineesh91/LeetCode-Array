import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dup = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])-1] > 0) {
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                dup.add(i+1);
            }
        }
        return dup;
    }
}