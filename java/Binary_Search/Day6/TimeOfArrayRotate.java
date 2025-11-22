package Day6;
import java.util.*;

public class TimeOfArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int rotations = TimesOfArrayRotate(arr, n);
        System.out.println("Array rotated: " + rotations + " times");
        

        sc.close();
    }


    public static int TimesOfArrayRotate(int[] arr, int n) {
        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }


            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1;
            }


            else {
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }

        return index;
    }
}