public class LargestNumberTwice {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max/2) {
                if(i != index) {
                    return -1;
                }
            }
        }
        return index;

    }
}
