public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        int maxVal = nums[0];
        boolean allneg = true;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                allneg = false;
            }
            if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
            sum1 += nums[i];
            if (sum1 < 0) {
                sum1 = 0;
            }
            if (sum < sum1) {
                sum = sum1;
            }
        }
        if(allneg == true) {
            sum = maxVal;
        }
        return sum;
    }
}
