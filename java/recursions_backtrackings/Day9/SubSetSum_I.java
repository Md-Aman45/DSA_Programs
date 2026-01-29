package recursions_backtrackings.Day9;
import java.util.*;

public class SubSetSum_I {
    public static void SumSubSet(int ind, int sum, int[] arr, int n, ArrayList<Integer> subSet) {
        if (ind == n) {
            subSet.add(sum);
            return;
        }

        // pick...
        SumSubSet(ind + 1, sum + arr[ind], arr, n, subSet);

        // not pick...
        SumSubSet(ind + 1, sum, arr, n, subSet);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> sumSub = new ArrayList<>();
        SumSubSet(0, 0, arr, n, sumSub);
        Collections.sort(sumSub);

        System.out.print("Subset sum: ");
        for (int val : sumSub) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}