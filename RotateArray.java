public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (k > len) {
            k = k % len;
        }
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            newArr[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            if ((len - k + i) < len && (len - k + i) >= 0) {
                nums[i] = newArr[len - k + i];
            }
            else if ((i - k) < len && (i - k) >= 0){
                nums[i] = newArr[i - k];
            }
        }

    }
}
