import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            int num = i;
            boolean sd = true;
            while(num > 0) {
                int k = num%10;
                if(k==0 || i%k != 0) {
                    sd = false;
                    break;
                }
                num = num/10;
            }
            if(sd) {
                ret.add(i);
            }
        }
        return ret;
    }
}
