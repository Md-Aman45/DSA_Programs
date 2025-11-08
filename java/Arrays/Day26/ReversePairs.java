package Day26;
import java.util.*;

public class ReversePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // -------- BRUTE APPROACH FOR REVERSE PAIRS ----------
        // int cnt = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] > 2 * arr[j]) {
        //             cnt += 1;
        //         }
        //     }
        // }

        // System.out.print("Reverse Pairs: " + cnt);





        
    }
}