package Day17;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int n = rows;
        int m = cols;

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements row by row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }



        // -------- OPTIMAL APPROACH --------
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        ArrayList<Integer> ans = new ArrayList<>();


        // logic ------ (right -> bottom -> left -> top) ------...
        while (top <= bottom && left <= right) {
            // right...
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // bottom...
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }


        // --------- OUTPUT ----------
        System.out.println("Spiral order:");
        for (int val : ans) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
