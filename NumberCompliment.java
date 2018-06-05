public class NumberCompliment {
    public int findComplement(int num) {
        int start = 0;
        int ret = 0;
        while(num/2 > 1) {
            if(num%2 == 0) {
                ret += Math.pow(2,start);
            }
            num = num/2;
            start++;
        }
        if(num%2 == 0) {
            ret += Math.pow(2,start);
        }
        return ret;
    }
}
