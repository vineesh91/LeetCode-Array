public class AlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int prev = 3;
        while(n > 0) {
            if(n%2 == prev) {
                return false;
            }
            prev = n%2;
            n = n/2;
        }
        return true;
    }
}
