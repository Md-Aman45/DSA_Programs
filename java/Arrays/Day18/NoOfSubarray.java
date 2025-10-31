package Day18;
import java.util.*;

public class NoOfSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the value of k (target sum): ");
        int k = sc.nextInt();



        // -------- BRUTE APPROACH FOR Number of Subarray --------
        // int cnt = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int sum = 0;
        //         for (int t = i; t <= j; t++) {
        //             sum = sum + arr[t];
        //         }
        //         if (sum == k) {
        //             cnt++;
        //         }
        //     }
        // }



        // -------- BETTER APPROACH --------
        // int cnt = 0;

        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum == k) {
        //             cnt++;
        //         }
        //     }
        // }




        // -------- OPTIMAL APPROACH --------
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);  // base case: prefix sum = 0 occurs once

        int preSum = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;

            // if (preSum - k) exists in map, add its count
            cnt += mpp.getOrDefault(remove, 0);

            // store/update prefix sum frequency
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }


        System.out.printf("Total number of subarrays with sum %d is: %d%n", k, cnt);
        sc.close();

    


    }
}