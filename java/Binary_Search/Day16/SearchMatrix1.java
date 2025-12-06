import java.util.*;

public class SearchMatrix1 {
    public boolean searchMatrix(int[][] arr, int n, int m, int target) {
        for (int i = 0; i < n; i++) {
            // for (int j = 0; j < m; j++) {
            //     if (arr[i][j] == target) return true;
            // }
            
            if (arr[i][0] <= target && target <= arr[i][m - 1]) {
                int low = 0;
                int high = m - 1;

                // Binary search on the row
                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (arr[i][mid] == target) return true;
                    else if (arr[i][mid] < target) low = mid + 1;
                    else high = mid - 1;
                }
            }
        }
        return false;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        SearchMatrix1 sm = new SearchMatrix1();

        boolean found = sm.searchMatrix(arr, n, m, target);
        System.out.println("Target found: " + found);


        sc.close();
    }
}