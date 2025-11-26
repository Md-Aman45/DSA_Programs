package Day9;
import java.util.*;

public class MBouquetsDays {
    public boolean possible(int[] arr, int day, int m, int k, int n) {
        int cnt = 0;
        int bouquets = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            }
            else {
                bouquets += (cnt / k);
                cnt = 0;
            }
        }
        bouquets += (cnt / k);

        return bouquets >= m;
    }


    public int roseGarden(int[] arr, int m, int k, int n) {
        long val = 1L * m * k;

        if (val > n) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low = mini, high = maxi;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (possible(arr, mid, m, k, n)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flowers (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter bloom days: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of bouquets (m): ");
        int m = sc.nextInt();

        System.out.print("Enter flowers needed for each bouquet (k): ");
        int k = sc.nextInt();

        MBouquetsDays obj = new MBouquetsDays();
        int ans = obj.roseGarden(arr, m, k, n);

        if (ans == -1) {
            System.out.println("There is no possible days.");
        }
        else {
            System.out.println("Minimum days required: " + ans);
        }

        sc.close();
    }
}
