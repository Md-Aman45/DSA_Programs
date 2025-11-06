package Day24;
import java.util.*;

public class MissingRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // -------- BRUTE APPROACH ---------
        // int repeating = -1;
        // int missing = -1;

        // for (int num = 1; num < n; num++) {
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] == num) {
        //             cnt++;
        //         }
        //     }
        //     if (cnt == 2) repeating = num;
        //     else if (cnt == 0) missing = num;
        // }




        // -------- BETTER APPROACH ---------
        // int[] hash = new int[n + 1];

        // for (int i = 0; i < n; i++ ){
        //     hash[arr[i]]++;
        // }

        // int repeating = -1;
        // int missing = -1;

        // for (int i = 1; i <= n; i++) {
        //     if (hash[i] == 2) repeating = i;
        //     else if (hash[i] == 0) missing = i;
        // }






        // -------- OPTIMAL APPROACH ---------
        long s = 0;
        long s2 = 0;
        long sn = (long) (n * (n + 1)) / 2;
        long s2n = (long) (n * (n + 1) * (2 * n + 1)) / 6;

        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * (long) arr[i];
        }

        long val1 = s - sn;
        long val2 = s2 - s2n;

        val2 = val2 / val1;

        long x = (long) (val1 + val2) / 2;
        long y = (long) x - val1;





        System.out.println("Repeating number: " + x);
        System.out.println("Missing number: " + y);

        sc.close();

        
    }
}
