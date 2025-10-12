package Sorting;
import java.util.*;

public class InSertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("Sorted arrays in insertion_sort: " + Arrays.toString(arr));
        sc.close();
    }
}
