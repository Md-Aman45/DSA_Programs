package Day23;
import java.util.*;

public class mergeOverLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        System.out.println("Enter intervals (start end): ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }




        // -------- BRUTE APPROACH ---------
        // Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        // List<int[]> ans = new ArrayList<>();

        // int[] current = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i][0] <= current[1]) {
        //         current[1] = Math.max(current[1], arr[i][1]);
        //     } else {
        //         ans.add(current);
        //         current = arr[i];
        //     }
        // }
        // ans.add(current);


        






        // -------- OPTIMAL APPROACH ----------
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();


        for (int[] interval : arr) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }






        // Output section...
        System.out.println("\nMerged Invervals: ");
        for (int[] i : ans) {
            System.out.println(i[0] + " " + i[1]);
        }

        sc.close();
    }
}
