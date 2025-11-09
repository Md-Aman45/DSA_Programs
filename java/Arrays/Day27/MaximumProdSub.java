package Day27;
import java.util.*;

public class MaximumProdSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // -------- BRUTE APPROACH FOR MAXIMUM PRODUCT SUBARRAY ----------
        // int maxi = Integer.MIN_VALUE;
        
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int prod = 1;
        //         for (int k = i; k <= j; k++) {
        //             prod = prod * arr[k];
        //         }

        //         maxi = Math.max(maxi, prod);
        //     }
        // }





        // -------- BETTER APPROACH ----------
        // int maxi = Integer.MIN_VALUE;
        
        // for (int i = 0; i < n; i++) {
        //     int prod = 1;
        //     for (int j = i; j < n; j++) {
        //         prod *= arr[j];
        //         maxi = Math.max(maxi, prod);
        //     }
        // }
        







        // -------- OPTIMAL APPROACH ----------
        int maxi = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[n - i - 1];

            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }





        System.out.print("Maximum product of subarray: " + maxi);

        sc.close();
    }
}
