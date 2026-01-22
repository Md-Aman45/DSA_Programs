package recursions_backtrackings.Day6;
import java.util.*;

public class RecursionPattern {
    public static void printSubsequence(int i, int[] arr, ArrayList<Integer> ds, int s, int sum) {
        if (i == arr.length) {
            if (s == sum) {
                System.out.println(ds);
            }
            return;
        }


        // pick the element...
        ds.add(arr[i]);
        s += arr[i];
        printSubsequence(i + 1, arr, ds, s, sum);

        // not pick the element...
        ds.remove(ds.size() - 1);
        s -= arr[i];
        printSubsequence(i + 1, arr, ds, s, sum);
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum K: ");
        int k = sc.nextInt();

        ArrayList<Integer> ds = new ArrayList<>();

        printSubsequence(0, arr, ds, 0, k);

        sc.close();
    }
}