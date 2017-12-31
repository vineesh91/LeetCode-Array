public class ThirdMaximum {
    public int thirdMax(int[] nums) {
        int max = nums[0];
        int secMax = 0;
        int thrdMax = 0;
        boolean secObt = false;
        boolean thrdObt = false;
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            if (nums[0] > nums[1])
                return nums[0];
            else
                return nums[1];
        }
        //secMax = nums[1];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                if(secObt == true){
                    thrdMax = secMax;
                    thrdObt = true;
                }
                secMax = max;
                secObt = true;
                max = nums[i];

            }
            else if (secObt == false && nums[i] != max) {
                secMax = nums[i];
                secObt = true;
            }
            else if(nums[i]> secMax && nums[i] != max && secObt == true) {
                thrdMax = secMax;
                secMax = nums[i];
                thrdObt = true;
            }
            else if(nums[i]> thrdMax && nums[i] != secMax && nums[i] != max && thrdObt == true) {
                thrdMax = nums[i];
                thrdObt = true;
            }
            else if(thrdObt == false && nums[i] != max && nums[i] != secMax) {
                thrdObt = true;
                thrdMax = nums[i];
            }
        }
        if(thrdObt == false) {
            return max;
        }
        return thrdMax;
    }
}
