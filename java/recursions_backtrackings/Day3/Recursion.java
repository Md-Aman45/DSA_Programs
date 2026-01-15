package recursions_backtrackings.Day3;
import java.util.*;

public class Recursion {

    // Reverse an array...
    public static void reverse(int l, int r, int[] arr) {
        if (l >= r) return;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(l + 1, r - 1, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(0, n - 1, arr);

        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
