import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToCharacter {
    //Takes more time less space
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
    //Takes less time more space
    public int[] shortestToChar2(String S, char C) {
        int N = S.length();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int start = -1;
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == C) {
                start = i;
                arr1[i] = 0;
            }
            else {
                if(start == -1) {
                    arr1[i] = 100001;
                }
                else {
                    arr1[i] = i - start;
                }
            }
        }
        start = -1;
        for(int i = N - 1; i > -1; i--) {
            if(S.charAt(i) == C) {
                start = i;
                arr2[i] = 0;
            }
            else {
                if(start != -1) {
                    arr2[i] = Math.min(arr1[i],start - i);
                }
                else {
                    arr2[i] = arr1[i];
                }
            }
        }
        return arr2;
    }
}
