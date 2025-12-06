package Day16;
import java.util.*;

public class SearchMatrix2 {
    // public int bs(int[] row, int target) {
    //     int low = 0, high = row.length - 1;

    //     while (low <= high) {
    //         int mid = (low + high) / 2;

    //         if (row[mid] == target) return mid;
    //         else if (row[mid] < target) low = mid + 1;
    //         else high = mid - 1;
    //     }

    //     return -1;
    // }



    // public int[] searchMatrix2(int[][] mat, int target, int n, int m) {
    //     for (int i = 0; i < n; i++) {
    //         int ind = bs(mat[i], target);
    //         if (ind != -1) {
    //             return new int[]{i, ind};
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }





    public int[] searchMatrix2(int[][] mat, int target, int n, int m) {
        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (mat[row][col] == target) return new int[]{row, col};

            else if (mat[row][col] < target) row++;

            else col--;
        }

        return new int[]{-1, -1};
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        SearchMatrix2 sm = new SearchMatrix2();
        int[] ans = sm.searchMatrix2(mat, target, n, m);

        System.out.print("Result: ");
        if (ans[0] != -1) {
            System.out.println("Target found at: " + "{" + ans[0] + ", " + ans[1] + "}");
        } else {
            // System.out.println("Target Not found in the matrix.");
            System.out.println("{-1, -1}");
        }

        sc.close();
    }
}