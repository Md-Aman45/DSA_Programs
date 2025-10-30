package Day17;
import java.util.*;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Rotation is only valid for square matrices!");
            sc.close();
            return;
        }

        int n = rows;
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements row by row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }




        // -------- BRUTE APPROACH FOR ROTATE IMAGE --------
        // int[][] ans = new int[n][n];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         ans[j][n - 1 - i] = matrix[i][j];
        //     }
        // }





        // -------- OPTIMAL APPROACH --------

        // Transpose the image...
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse every row...
        // -> clockwise rotate...
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }


        // -> antiClockwise rotate...
        // for (int j = 0; j < n; j++) {
        //     int top = 0, bottom = n - 1;

        //     while (top < bottom) {
        //         int temp = matrix[top][j];
        //         matrix[top][j] = matrix[bottom][j];
        //         matrix[bottom][j] = temp;
        //         top++;
        //         bottom--;
        //     }
        // }



        // --------- OUTPUT ----------
        System.out.println("Rotated Matrix (90° clockwise) by:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();

    }
}
