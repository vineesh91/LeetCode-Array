public class RemoveDuplicatesArray {
    public int removeDuplicates(int[] nums) {
        int len = 1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    nums[len] = nums[j];
                    len = len + 1;
                    i = j-1;
                    break;
                }
            }
        }
        return len;
    }
}
