import java.util.HashMap;

public class ContainsDuplicatesTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean dup = false;
        HashMap h = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])){
                int val = Integer.parseInt(h.get(nums[i]).toString());
                if(Math.abs(val - i) <= k)
                return true;
            }
            h.put(nums[i],i);

        }
        return  dup;
    }
}
