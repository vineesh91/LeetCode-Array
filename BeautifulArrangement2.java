public class BeautifulArrangement2 {
    public int[] constructArray(int n, int k) {
        int[] ret = new int[n];
        int l = 0;
        int elem = 1;
        for(int i = 0; i < n; i++) {
            if(i%2 == 1 && k > 0) {
                ret[i] = elem-1+k;
                if(ret[i] == elem) {
                    elem++;
                }
                k -= 2;
                if(k >= 0) {
                    l++;
                }
            }
            else if(i%2 == 0 && l!= 0) {
                ret[i] = elem;
                elem++;
                l--;
            }
            else {
                ret[i] = i+1;
                elem++;
            }
        }
        return ret;
    }
}
