package Bit_Manipulation.Day3;
import java.util.*;


public class Xor_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n no.: ");
        // int n = sc.nextInt();

        System.out.print("Enter L: ");
        int L = sc.nextInt();

        System.out.print("Enter R: ");
        int R = sc.nextInt();

        // int ans = range(n);
        int ans = range(R) ^ range(L - 1);
        // System.out.print("xor from 1 to n: " + ans);
        System.out.print("Xor from L to R: " + ans);

        sc.close();
    }


    public static int range(int n) {
        // if (n % 4 == 1) return 1;
        // else if (n % 4 == 2) return n + 1;
        // else if (n % 4 == 3) return 0;
        // else return n;


        switch (n % 4) {
            case 0: return n;
            case 1: return 1;
            case 2: return n + 1;
            default: return 0;
        }
    }
}