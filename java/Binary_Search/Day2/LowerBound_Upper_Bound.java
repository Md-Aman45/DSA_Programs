package Day2;
import java.util.*;

public class LowerBound_Upper_Bound {
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



        // ---------- Lower Bound ----------
        // int low = 0, high = n - 1;
        // int ans = n;

        // while (low <= high) {
        //     int mid = (low + high) / 2;


        //     if (arr[mid] >= x) {
        //         ans = mid;
        //         high = mid - 1;
        //     }
        //     else {
        //         low = mid + 1;
        //     }
        // }

        // System.out.println("Lower Bound index = " + ans);
        // System.out.println("Lower Bound number = " + arr[ans]);






        // ---------- Upper Bound ----------
        // int low = 0, high = n - 1;
        // int ans = n;

        // while (low <= high) {
        //     int mid = (low + high) / 2;


        //     if (arr[mid] > x) {
        //         ans = mid;
        //         high = mid - 1;
        //     }
        //     else {
        //         low = mid + 1;
        //     }
        // }

        // System.out.println("Upper Bound index = " + ans);
        // System.out.println("Upper Bound number = " + arr[ans]);






        // ---------- Search Insert Position ----------
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if (ans == n) {
            System.out.println("No number >= " + x + " found in array");
        } else {
            System.out.println("Insert before this Position = " + arr[ans]);
        }




        sc.close();
    }
}
