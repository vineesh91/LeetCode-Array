public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum1;
        int sum2;
        for(int i = 0; i < nums.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for(int j = 0; j < i; j++) {
                sum1 += nums[j];
            }
            for(int j = i+1; j <nums.length; j++) {
                sum2 += nums[j];
            }
            if(sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }
}
