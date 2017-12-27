public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[j] > nums2[i]) {
                    int k = j;
                    int elem = nums1[k];
                    while( k < m+1) {
                        int elem2 = nums1[k];
                        if(k==j){
                            nums1[k] = nums2[i];
                        }
                        else {
                            nums1[k] = elem;
                        }
                        elem = elem2;
                        k++;
                    }
                    m+=1;
                    break;
                }
                else if(j == m-1) {
                    nums1[m] = nums2[i];
                    m+=1;
                    break;
                }
            }
        }
    }
}
