public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] != nums[j]) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        len = len + 1;
                        break;
                    }
                }
            }
            else {
                len = len + 1;
            }
        }
        return len;
    }
}
