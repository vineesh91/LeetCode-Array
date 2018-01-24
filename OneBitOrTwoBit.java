public class OneBitOrTwoBit {
    public boolean isOneBitCharacter(int[] bits) {
        int chrType = 0;
        for(int i = 0; i < bits.length; i++) {
            if(bits[i] == 0) {
                if(chrType == 1) {
                    if(i == bits.length - 1) {
                        return false;
                    }
                    chrType = 0;
                }
            }
            if(bits[i] == 1) {
                if(chrType == 0) {
                    chrType = 1;
                }
                else {
                    chrType = 0;
                }
            }
        }
        return true;
    }
}
