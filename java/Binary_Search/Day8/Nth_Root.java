package Day8;
import java.util.*;

public class Nth_Root {
    // Function to calculate x^n (power)...
    // public static long power(long x, long n) {
    //     long ans = 1;
    //     for (int i = 1; i <= n; i++) {
    //         ans *= x;
    //     }
    //     return ans;
    // }



    // Function to calculate mid^n safely (to avoid overflow)...
    public static long powerExpo(long mid, long n, long m) {
        // return 1 if == m...
        // return 0 if < m...
        // return 2 if > m...
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;

        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No of Nth Root:- ");
        long n = sc.nextLong();

        System.out.print("Number:- ");
        long m = sc.nextLong();

        long ans = -1;


        // ---------- Linear Search ----------
        // for (long i = 1; i <= m; i++) {
        //     long val = power(i, n);

        //     if (val == m) {
        //         ans = i;
        //         break;
        //     } else if (val > m) {
        //         break;
        //     }
        // }

        // System.out.println("Nth Root = " + ans);





        // ---------- Binary Search ----------
        long low = 1, high = m;

        while (low <= high) {
            long mid = (low + high) / 2;
            long midN = powerExpo(mid, n, m);

            if (midN == 1) {
                ans = mid;
                break;
            }
            else if (midN == 0) low = mid + 1;
            else high = mid - 1;
        }
        
        System.out.println("Nth Root = " + ans);

        sc.close();
    }
}
