package Day15;
import java.util.*;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // // brute approach for (Leaders in an Array)...
        // ArrayList<Integer> ans = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     boolean Leader = true;
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[j] > arr[i]) {
        //             Leader = false;
        //             break;
        //         }
        //     }

        //     if (Leader == true) {
        //         ans.add(arr[i]);
        //     }
        // }
        // System.out.println("Leaders in the array: " + ans);




        // // optimal approach...
        ArrayList<Integer> ans = new ArrayList<>();

        int maxi = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                ans.add(arr[i]);
            }

            maxi = Math.max(maxi, arr[i]);
        }

        // for original...
        // Collections.reverse(ans);

        System.out.println("Leaders in the Array: " + ans);




        sc.close();
    }
}