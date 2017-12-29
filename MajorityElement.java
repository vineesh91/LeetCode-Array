public class MajorityElement {
    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int lim = nums.length/2;
        int occ = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == elem) {
               occ++;
            }
            else {
                occ--;
            }
            if(occ == 0) {
                elem  = nums[i];
                occ = 1;
            }
        }
        return elem;
    }
}
