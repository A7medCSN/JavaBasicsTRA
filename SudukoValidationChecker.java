
import java.util.HashSet;
import java.util.Set;

public class SudukoValidationChecker {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        isValidSudoku(board);
    }

    public static void isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num == '.') continue;

                // check for any invalid condition
                if (rows[i].contains(num) || cols[j].contains(num) || boxes[(i / 3) * 3 + j / 3].contains(num)) {
                    System.out.println("Is Sudoku Valid? "+false);
                    return;
                }

                // add number to set if no duplication
                rows[i].add(num);
                cols[j].add(num);
                boxes[(i / 3) * 3 + j / 3].add(num);
            }
        }

        System.out.println("Is Sudoku Valid? "+true);
    }
}
