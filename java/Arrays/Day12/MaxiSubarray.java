package Day12;
import java.util.*;

public class MaxiSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // // optimal approach (Kadane's Algorithm...)...
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        int start = 0, ansStart = -1, ansEnd = -1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxi);

        if (ansStart != -1 && ansEnd != -1) {
            System.out.print("Subarray: ");

            for (int i = ansStart; i <= ansEnd; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}