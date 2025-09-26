import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// // RevNum + Palindrome + Armstrong...
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int dup = n;
        // int count = 0;
        // int revNum = 0;
        // int sum = 0;
        // while(n > 0) {
        // int lastDigit = n % 10;
        // count++;
        // n = n / 10;
        // revNum = revNum * 10 + lastDigit;

        // sum = sum + (lastDigit * lastDigit * lastDigit);
        // }
        // if(dup == revNum) {
        // System.out.println("Is no. is palindrome:- Yes");
        // } else {
        // System.out.println("Is no. is palindrome:- No");
        // }

        // if(dup == sum) {
        // System.out.println("Is no. is armstrong:- Yes");
        // } else {
        // System.out.println("Is no. is armstrong:- No");
        // }

        // System.out.println("No.:- " + count);
        // System.out.print("RevNum:- " + revNum);

        // // print All Divisions
        // ArrayList<Integer> divisors = new ArrayList<>();

        // for(int i = 1; i <= Math.sqrt(n); i++) {
        // if(n%i == 0) {
        // divisors.add(i);
        // if(n/i != i) {
        // divisors.add(n/i);
        // }
        // }
        // }
        // Collections.sort(divisors);
        // System.out.println("Numbers Divided by " + (n) + ":-" + (divisors));
        // }
        // }

        // // Prime No.
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println("No. is prime:-" + " " + n);
        // } else {
        // System.out.println("No. is not prime:-" + " " + n);
        // }




        // // Prime Factor of a Number
        int n = sc.nextInt();
        int dup = n;
        ArrayList<Integer> prime_factors = new ArrayList<>();

        for (int i = 2; i * i <= n; i++) {
            if (n%i == 0) {
                prime_factors.add(i);

                while(n%i == 0) {
                    n = n/i;
                }
            }
        }
        if(n != 1) {
            prime_factors.add(n);
        }
        // System.out.println("Prime Factors of" + " " + dup + ":-" + " " + prime_factors);
        System.out.printf("Prime Factors of %d :- %s%n", dup, prime_factors);
         



        // // gcp...
        // int a = 11;
        // int b = 8;
        // while (a > 0 && b > 0) {
        //     if (a > b) {
        //         a = a % b;
        //     } else {
        //         b = b % a;
        //     }
        // }
        // if (a == 0) {
        //     System.out.println(b);
        // } else {
        //     System.out.println(a);
        // }
    }
}
