package Day5;
import java.util.*;

public class MinRotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int value = minimumRotate(arr, n);
        System.out.print("Minimum element: " + value);
        

        sc.close();
    }



    public static int minimumRotate(int[] arr, int n) {
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            else if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }

            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }
}