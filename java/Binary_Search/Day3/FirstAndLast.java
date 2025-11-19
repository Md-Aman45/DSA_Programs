package Day3;

import java.util.*;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        // --------- Linear Search --------
        // int first = -1, last = -1;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == x) {
        // if (first == -1) {
        // first = i;
        // }

        // last = i;
        // }
        // }





        // ---------- Better ---------
        // Lower Bound...
        // int low = 0, high = n - 1;
        // int lb = n;

        // while (low <= high) {
        //     int mid = (low + high) / 2;

        //     if (arr[mid] >= x) {
        //         lb = mid;
        //         high = mid - 1;
        //     } else {
        //         low = mid + 1;
        //     }
        // }

        // // Upper Bound...
        // low = 0;
        // high = n - 1;
        // int ub = n;

        // while (low <= high) {
        //     int mid = (low + high) / 2;

        //     if (arr[mid] > x) {
        //         ub = mid;
        //         high = mid - 1;
        //     } else {
        //         low = mid + 1;
        //     }
        // }

        // // Main...
        // // First Occurrence...
        // int first;
        // if (lb == n || arr[lb] != x) {
        //     first = -1;
        // } else {
        //     first = lb;
        // }

        // // Last Occurrence...
        // int last;
        // if (first == -1) {
        //     last = -1;
        // } else {
        //     last = ub - 1;
        // }






        // Use functions
        int first = firstOccurrence(arr, n, x);
        int last  = lastOccurrence(arr, n, x);
        


        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);

        sc.close();
    }



    // First Occurrence...
    public static int firstOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }




    // ---------- Last occurrence ----------
    public static int lastOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last;
    }

}