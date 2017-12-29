import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])-1] < 0) {
                dup.add(Math.abs(nums[i]));
            }
            else {
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        return dup;
    }
}
