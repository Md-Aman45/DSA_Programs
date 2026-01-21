package recursions_backtrackings.Day5;
import java.util.*;

public class SubsequenceRecursion {
    public static void Subsequence(int index, int[] arr, ArrayList<Integer> ds) {
        if (index >= arr.length) {
            System.out.println(ds);
            return;
        }

        // pick the element...
        ds.add(arr[index]);
        Subsequence(index + 1, arr, ds);

        // not pick the element (backtrack)
        ds.remove(ds.size() - 1);
        Subsequence(index + 1, arr, ds);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ds = new ArrayList<>();

        Subsequence(0, arr, ds);
    }
}