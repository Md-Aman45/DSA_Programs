package Day7;
import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // ----------- Linear Search -----------
        // boolean found = false;
        // for (int i = 0; i < n; i++) {
        //     if ((i == 0 || arr[i - 1] < arr[i]) && (i == n - 1 || arr[i] > arr[i + 1])) {
        //         System.out.println("Peak Element found at index " + i + " with value " + arr[i] + ".");
        //         found = true;
        //     }
        // }
        // if (!found) {
        //     System.out.println("No peak element found.");
        // }



        int ans = peak_element(arr, n);

        if (ans != -1) {
            System.out.println("Peak Element found at index " + ans + " with value " + arr[ans] + ".");
        } else {
            System.out.println("No peak element found.");
        }


        sc.close();
    }


    // ----------- Binary Search -----------
    public static int peak_element(int[] arr, int n) {
        if (n == 1) return 0;

        if (arr[0] > arr[1]) return 0;

        if (arr[n - 1] > arr[n - 2]) return n - 1;


        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;

            else if (arr[mid] > arr[mid - 1]) low = mid + 1;

            // Only for 1 peak element...
            // else if (arr[mid] > arr[mid + 1]) high = mid - 1;

            // for multiple peak...
            else high = mid - 1;
        }


        return -1;
    }
}
