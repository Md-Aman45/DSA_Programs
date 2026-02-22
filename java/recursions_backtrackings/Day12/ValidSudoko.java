package recursions_backtrackings.Day12;
import java.util.*;

public class ValidSudoko {
    public static void solveSudoko(char[][] board) {
        solve(board);
    }

    private static boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }


    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == 'c')
                return false;

            if (board[i][col] == 'c')
                return false;

            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }

        return true;
    }


    public static void printBoard(char[][] board) {
        System.out.println("\nSolved Sudoku:\n");

        for (int i = 0; i < 9; i++) {

            if (i % 3 == 0)
                System.out.println("-------------------------");

            for (int j = 0; j < 9; j++) {

                if (j % 3 == 0)
                    System.out.print("| ");

                System.out.print(board[i][j] + " ");
            }

            System.out.println("|");
        }

        System.out.println("-------------------------");
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];

        System.out.println("Enter Sudoku (use . for empty cells):");

        for (int i = 0; i < 9; i++) {
            String row = sc.nextLine();
            board[i] = row.toCharArray();
        }

        solveSudoko(board);
        printBoard(board);

    }

}