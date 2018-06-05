import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToCharacter {
    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ret = new int[N];
        List<Integer> positions = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == C)
                positions.add(i);
        }
        int start = 0;
        for(int i = 0; i < N; i++) {
            if(i < positions.get(start)) {
                ret[i] = Math.abs(positions.get(start) - i);
            }
            else if(i == positions.get(start)) {
                ret[i] = 0;
            }
            else {
                if(start == positions.size()-1) {
                    ret[i] = Math.abs(positions.get(start) - i);
                }
                else {
                    if(Math.abs(i - positions.get(start)) >= Math.abs(i - positions.get(start+1))) {
                        start = start + 1;
                        ret[i] = Math.abs(positions.get(start) - i);
                    }
                    else {
                        ret[i] = Math.abs(positions.get(start) - i);
                    }
                }
            }
        }
        return ret;
    }
}
