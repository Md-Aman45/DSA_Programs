package Day22;
import java.util.*;

public class SubarrayWithXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");

        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();




        // -------- BRUTE APPROACH --------
        // int cnt = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int XOR_ = 0;
        //         for (int t = i; t <= j; t++) {
        //             XOR_ = XOR_ ^ arr[t];
        //         }

        //         if (XOR_ == k) cnt++;
                
        //     }
        // }







        // -------- BETTER APPROACH --------
        // int cnt = 0;

        // for (int i = 0; i < n; i++) {
        //     int XOR_ = 0;
        //     for (int j = i; j < n; j++) {
        //         XOR_ = XOR_ ^ arr[j];
        //         if (XOR_ == k) cnt++;
        //     }
        // }



        // -------- OPTIMAL APPROACH --------
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int xr = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ k;
            cnt += mpp.getOrDefault(x, 0);

            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }



        

        // Output section...
        System.out.printf("Total number of subarrays with XOR %d is: %d%n", k, cnt);
        sc.close();
    }
}
