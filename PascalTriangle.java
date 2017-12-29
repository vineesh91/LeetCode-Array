import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        if(numRows > 0) {
            List<Integer> lst = new ArrayList<Integer>();
            lst.add(1);
            finalList.add(lst);
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> lst = new ArrayList<Integer>();
            lst.add(1);
            for (int j = 1; j < i; j++) {
                int val = finalList.get(i-1).get(j-1)+finalList.get(i-1).get(j);
                lst.add(val);
            }
            lst.add(1);
            finalList.add(lst);
        }
        return finalList;
    }
}
