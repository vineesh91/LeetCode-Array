import java.util.HashMap;

public class Battleships {
    public int countBattleships(char[][] board) {
        int count = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'X' || board[i][j] == 'Y') {
                    if(board[i][j] == 'X') {
                        count++;
                    }
                    if(i < board.length-1) {
                        if(board[i+1][j] == 'X') {
                            board[i+1][j] = 'Y';
                        }
                    }
                    if(j < board[0].length - 1) {
                        if(board[i][j+1] == 'X') {
                            board[i][j+1] = 'Y';
                        }
                    }
                }
            }
        }
        return count;
    }
}
