package Day12;

import java.util.Scanner;

public class prodSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        long maxProd = arr[0];
        long minProd = arr[0];
        long result = arr[0];

        for (int i = 1; i < n; i++) {
            long curr = arr[i];

            if (curr < 0) {
                long temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            result = Math.max(result, maxProd);
        }

        System.out.print("Maximum product subarray: " + result);


        sc.close();

    }
}
