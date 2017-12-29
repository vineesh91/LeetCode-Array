import java.util.HashMap;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        boolean dup = false;
        HashMap h = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])){
                return true;
            }
            h.put(nums[i],i);

        }
        return  dup;
    }
}
