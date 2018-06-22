public class CountingBits {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        int n = 4;
        int count = 0;
        boolean flag = true;
        for(int i = 0; i <= num; i++) {
            if(i < 4) {
                ret[i] = i/2 + i%2;
            }
            else {
                switch(i%4) {
                    case 0 : {
                        if(i%n == 0) {
                            n = n*2;
                            ret[i] = 1;
                            flag = true;
                        }
                        else {
                            if(flag) {
                                ret[i] = ret[i - 4] + 1;
                                flag = false;
                            }
                            else {
                                if(i%24 == 0) {
                                    ret[i] = ret[i - 4] - 1;
                                    count++;
                                }
                                else {
                                    ret[i] = ret[i - 4];
                                }
                                flag = true;
                            }
                        }
                        break;}
                    case 1 : ret[i] = 1+ret[i-1];break;
                    case 2 : ret[i] = ret[i-1];break;
                    case 3 : ret[i] = 1+ret[i-1];break;
                }
            }
        }
        return ret;
    }
}
