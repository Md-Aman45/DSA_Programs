package Day15;
import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // // optimal approach for next permutation...
        int index = -1;


        // Step 1: Find the first index from the end where arr[i] < arr[i+1]...
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }


        // Step 2: If no such index exists, reverse the entire array...
        if (index == -1) {
            reverse(arr, 0 , n - 1);
        } else {
            // Step 3: Find the next greater element to the right of index...
            for (int i = n - 1; i >= index; i--) {
                if (arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }


            // Step 4: Reverse the subarray to the right of index
            reverse(arr, index + 1, n - 1);
        }


        System.out.print("Next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }




    // Utility to swap two elements
    public static void swap(int[] arr, int i , int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }



    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}