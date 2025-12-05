package Day15;

import java.util.*;

public class RowWithMax1 {
    // public int rowWithMaxOnes(int[][] arr, int n, int m) {
    //     int ind = -1;
    //     int maxCnt = -1;

    //     for (int i = 0; i < n; i++) {
    //         int cntRow = 0;

    //         for (int j = 0; j < m; j++) {
    //             cntRow += arr[i][j];
    //         }

    //         if (cntRow > maxCnt) {
    //             maxCnt = cntRow;
    //             ind = i;
    //         }
    //     }

    //     return ind;
    // }





    // public int lowerBound(int[] arr, int n, int x) {
    //     // ---------- Lower Bound ----------
    //     int low = 0, high = n - 1;
    //     int ans = n;

    //     while (low <= high) {
    //         int mid = (low + high) / 2;


    //         if (arr[mid] >= x) {
    //             ans = mid;
    //             high = mid - 1;
    //         }
    //         else {
    //             low = mid + 1;
    //         }
    //     }

    //     return ans;
    // }




    // ---------- Binary Search ----------
    // public int rowWithMaxOnes(int[][] arr, int n, int m) {
    //     int cntMax = 0;
    //     int index = -1;

    //     for (int i = 0; i < n; i++) {
    //         int cntOnes = m - lowerBound(arr[i], m, 1);

    //         if (cntOnes > cntMax) {
    //             cntMax = cntOnes;
    //             index = i;
    //         }
    //     }

    //     return index;
    // }

    public int rowWithMaxOnes(int[][] arr, int n, int m) {
        int maxRow = -1;
        int j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                maxRow = i;
            }
        }

        return maxRow;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter matrix (0s and 1s): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        RowWithMax1 obj = new RowWithMax1();
        int ans = obj.rowWithMaxOnes(arr, n, m);

        System.out.println("Row with maximum number of 1s = " + ans + "th index");


        sc.close();
    }

}