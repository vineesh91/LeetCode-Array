
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int sz = temperatures.length;
        int[] ret = new int[sz];
        for(int i = 0; i < sz; i++) {
            for(int j = i + 1; j < sz; j++) {
                if(temperatures[j] > temperatures[i]) {
                    ret[i] = j - i;
                    break;
                }
                else {
                    ret[i] = 0;
                }
            }
        }
        return ret;
    }
}
