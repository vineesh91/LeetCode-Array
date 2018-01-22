public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] elem = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            elem[0] = i+1;
            int hi = numbers.length-1;
            int lo = i+1;
            while (hi >= lo) {
                int mid = (hi + lo)/2;
                if(numbers[mid] == target - numbers[i]) {
                    elem[1] = mid + 1;
                    return elem;
                }
                else if (numbers[mid] < target - numbers[i]) {
                    lo = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }
        }
        return elem;
    }
}
