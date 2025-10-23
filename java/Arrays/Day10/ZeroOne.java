package Day10;
import java.util.*;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // // better approach...
        // int cnt0 = 0; 
        // int cnt1 = 0; 
        // int cnt2 = 0;

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] == 0) {
        //         cnt0++;
        //     } else if (arr[i] == 1) {
        //         cnt1++;
        //     } else {
        //         cnt2++;
        //     }
        // }

        // for (int i = 0; i < cnt0; i++) arr[i] = 0;
        // for (int i = cnt0; i < cnt0 + cnt1; i++) arr[i] = 1;
        // for (int i = cnt0 + cnt1; i < n; i++) arr[i] = 2;
        

        // System.out.print("Sorted array: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        // // ( TC -> O(nlogn) and SC -> O(1) )





        // // Optimal approach :- 2 pointer (Dutch National Flag Algorithm)...
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++; 
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }


        System.out.print("Sorted Array with 2-pointer: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        sc.close();
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
