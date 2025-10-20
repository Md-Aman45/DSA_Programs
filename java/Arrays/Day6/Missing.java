package Day6;

import java.util.*;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // // Brute approach...
        // for (int i = 1; i <= n; i++) {
        //     int flag = 0;
        //     for (int j = 0; j < n-1; j++) {
        //         if (arr[j] == i) {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         System.out.print("missing array is: " +  i);
        //     }
        // }




        // // better approach...
        // int hash[] = new int[n + 1];

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] <= n) {
        //         hash[arr[i]] = 1;
        //     }
        // }

        // for (int i = 1; i < n; i++) {
        //     if (hash[i] == 0) {
        //         System.out.print("Missing array is: " + i);
        //         return;
        //     }
        // }

        // System.out.print("No number is missing");




        // // optimal approach 1 (using sum)...
        // int sum = n * (n + 1) / 2;
        // int s = 0;

        // for (int i = 0; i < n -1; i++) {
        //     s += arr[i];
        // }
        
        // int missing = sum - s;
        // System.out.print("Missing number is: " + missing);




        // // optimal approach 2 (using xor)...
        int XOR1 = 0, XOR2 = 0;
        for (int i = 1; i <= n; i ++) {
            XOR1 = XOR1 ^ i;
        }

        for (int i = 0; i < n - 1; i++) {
            XOR2 = XOR2 ^ arr[i];
        }

        int missing = XOR1 ^ XOR2;
        System.out.print("Missing number is: " + missing);


        sc.close();
    }
}