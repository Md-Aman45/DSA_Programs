package recursions_backtrackings.Day11;
import java.util.*;

public class NQueens {
    public static void solve(int col, List<String> board, List<List<String>> ans, int[] leftRow, int[] upperDiagonal,
            int[] lowerDiagonal, int n) {
        if (col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {
                char[] currentRow = board.get(row).toCharArray();
                currentRow[col] = 'Q';
                board.set(row, new String(currentRow));

                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;

                upperDiagonal[n - 1 + col - row] = 1;

                solve(col + 1, board, ans, leftRow, upperDiagonal, lowerDiagonal, n);

                currentRow = board.get(row).toCharArray();

                currentRow[col] = '.';

                board.set(row, new String(currentRow));

                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of board: ");
        int n = sc.nextInt();

        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            board.add(new String(row));
        }

        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];

        solve(0, board, ans, leftRow, upperDiagonal, lowerDiagonal, n);

        System.out.println("Solutions in Chess Board Style:\n");

        for (List<String> solution : ans) {
            for (String row : solution) {
                for (int i = 0; i < row.length(); i++) {
                    if (row.charAt(i) == 'Q') {
                        System.out.print(" Q ");
                    } else {
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
            System.out.println("---------------------");
        }

        sc.close();
    }
}
