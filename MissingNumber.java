import static java.lang.Math.abs;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int no = 0;
        int len  = nums.length;
        for(int i = 0; i < len; i++) {
            if (abs(nums[i]) < len) {
                if (nums[abs(nums[i])] == 0) {
                    if(nums[0] > -1) {
                        nums[0] = -nums[0];
                    }
                    nums[abs(nums[i])] = -(len + 1);
                }
                else {
                    nums[abs(nums[i])] = -nums[abs(nums[i])];
                }
            }
        }
        for (int i =0; i < len; i++) {
            if(nums[i] > -1) {
                return i;
            }
        }
        return len;
    }
}
