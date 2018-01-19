public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        int[] nums2 = new int[nums.length];
        sort(nums,nums2,0,nums.length-1);
        for(int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
    public void merge(int[] a, int[] b, int lo, int mid, int hi) {
        for(int i = lo; i <= hi ; i++) {
            b[i] = a[i];
        }
        int k = lo;
        int l = mid+1;
        for(int j = lo; j <= hi; j++) {
            if(k > mid) {
                a[j] = b[j++];
            }
            else if(l > hi) {
                a[j] = b[k++];
            }
            else if(b[l] < b[k]) {
                a[j] = b[l++];
            }
            else {
                a[j] = b[k++];
            }
        }
    }
    public void sort(int[] a, int[] b, int lo, int hi) {
        if(hi <= lo) {
            return;
        }
        int mid = (hi+lo)/2;
        sort(a,b,lo,mid);
        sort(a,b,mid+1,hi);
        merge(a,b,lo,mid,hi);
    }
}
