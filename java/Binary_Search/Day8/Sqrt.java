package Day8;
import java.util.*;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No.:- ");
        long n = sc.nextLong();
        long ans = 1;


        // --------- Linear Search ---------
        // for (long i = 1; i <= n; i++) {
        //     if (i * i <= n) {
        //         ans = i;
        //     }
        //     else {
        //         break;
        //     }
        // }

        // System.out.println("Square root (integer part) = " + ans);




        // ---------- Binary Search -----------
        long low = 1, high = n;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // System.out.println("Square root (integer part) = " + high);
        System.out.println("Square root (integer part) = " + ans);




        sc.close();
    }
}