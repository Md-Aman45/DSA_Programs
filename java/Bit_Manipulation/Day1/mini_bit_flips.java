package Bit_Manipulation.Day1;
import java.util.*;


public class mini_bit_flips {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = minBitFlips(a, b);

        System.out.print("Minimum bit flips required: " + result);

        sc.close();
    }


    static int minBitFlips(int a, int b) {
        int xor = a ^ b;
        int cnt = 0;

        while (xor != 0) {
            if ((xor & 1) == 1) {
                cnt++;
            }

            xor >>= 1;
        }

        return cnt;
    }
}
