import java.util.*;

public class Binary_Search {

    // ---------- Recursive Code ----------
    public static int binary_search_recursive(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = low + ((high - low) / 2);

        if (arr[mid] == target) return mid;
        else if (target > arr[mid]) return binary_search_recursive(arr, mid + 1, high, target);
        
        else return binary_search_recursive(arr, low, mid - 1, target);


    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");

        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // Sort the array (important for binary search)...
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


        System.out.print("Enter target: ");
        int target = sc.nextInt();



        // ---------- Binary Search ----------

        // // Iterative code...
        // int low = 0, high = n - 1;
        // boolean found = false;

        // while(low <= high) {
        //     int mid = (low + high) / 2;

        //     if (arr[mid] == target) {
        //         System.out.print("Target found at index: " + mid);
        //         found = true;
        //         break;
        //     }
        //     else if (target > arr[mid]) low = mid + 1;
        //     else {
        //         high = mid - 1;
        //     }
        // }

        // if (!found) {
        //     System.out.println("Target not found in array.");
        // }




        // Call Recursive function...
        int result = binary_search_recursive(arr, 0, n - 1, target);

        if (result == -1) {
            System.out.println("Target not found in array.");
        }
        else {
            System.out.println("Target found at index: " + result);
        }


        sc.close();
    }
}
