public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int t = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return t;
    }
}
