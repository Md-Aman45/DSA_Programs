package Day11;
import java.util.*;

public class KMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter k: ");
        int k = sc.nextInt();


        KMissingNumber obj = new KMissingNumber();
        int ans = obj.findKthMissing(arr, k);

        System.out.print("Output: " + ans);


        sc.close();


    }

    public int findKthMissing(int[] arr, int k) {
        int n = arr.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) low = mid + 1;

            else high = mid - 1;
        }

        // return (high + 1 + k);
        return low + k;
    }
}