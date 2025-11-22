package Day6;

import java.util.*;

public class SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        
        int single = FindSingleElement(arr, n);
        System.out.println("Single element is: " + single);




        sc.close();
    }

    // ---------- Brute Force Approach ----------
    // public static int FindSingleElement(int[] arr, int n) {
    // if (n == 1) return arr[0];

    // for (int i = 0; i < n; i++) {
    // if (i == 0) {
    // if (arr[i] != arr[i + 1]) return arr[i];
    // }
    // else if (i == n - 1) {
    // if (arr[i] != arr[i - 1]) return arr[i];
    // }
    // else {
    // if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) return arr[i];
    // }
    // }

    // return -1;
    // }





    // ----------- Binary Search -----------
    public static int FindSingleElement(int[] arr, int n) {
        if (n == 1)
            return arr[0];

        if (arr[0] != arr[1])
            return arr[0];

        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1])
                return arr[mid];

            // Left Half...
            if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            }

            // Right Half...
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
