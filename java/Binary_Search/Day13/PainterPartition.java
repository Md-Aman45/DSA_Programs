package Day13;
import java.util.*;

public class PainterPartition {
    public int countPainters(int[] arr, int units) {
        int painters = 1;
        long currentUnits = (long) 0;

        for (int num : arr) {
            if (currentUnits+ num <= units) {
                currentUnits += num;
            }
            else {
                painters++;
                currentUnits = num;
            }
        }
        return painters;
    }

    public int totalSum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;

        return total;
    }


    public int findUnits(int[] arr, int n, int k) {
        if (k > n) return -1;

        int low = Arrays.stream(arr).max().getAsInt();
        int high = totalSum(arr);

        // ---------- Linear Search ----------
        for (int units = low; units <= high; units++) {
            int requirePainters = countPainters(arr, units);

            if (requirePainters <= k) return units;
        }

        return -1;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of boards: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter units of each board: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of painters: ");
        int k = sc.nextInt();

        PainterPartition obj = new PainterPartition();
        int ans = obj.findUnits(arr, n, k);
        System.out.println("Minimum time required = " + ans);

        sc.close();
    }
}