package Day12;
import java.util.*;

public class AggressiveCows {
    public boolean canWePlace(int[] arr, int distance, int cows) {
        int cntCows = 1;
        int lastPos = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPos >= distance) {
                cntCows++;
                lastPos = arr[i];
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }



    // ---------- Linear Search ----------
    // public int aggressiveCows(int[] arr, int cows) {
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     int n1 = arr[n - 1] - arr[0];

    //     for (int i = 1; i <= n1; i++) {
    //         if (canWePlace(arr, i, cows) == true) continue;

    //         else return (i - 1);
    //     }

    //     return -1;
    // }


    // ---------- Binary Search ----------
    public int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int n = arr.length;

        int low = 1, high = arr[n - 1] - arr[0];

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canWePlace(arr, mid, cows) == true) low = mid + 1;

            else high = mid - 1;
        }

        return high;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stalls: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the stall positions: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of cows: ");
        int cows = sc.nextInt();

        AggressiveCows obj = new AggressiveCows();
        int ans = obj.aggressiveCows(arr, cows);


        System.out.println("The largest minimum distance is: " + ans);



        sc.close();
    }
}