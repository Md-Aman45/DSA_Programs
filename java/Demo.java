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
        // int n = sc.nextInt();
        // int dup = n;
        // ArrayList<Integer> prime_factors = new ArrayList<>();

        // for (int i = 2; i * i <= n; i++) {
        //     if (n%i == 0) {
        //         prime_factors.add(i);

        //         while(n%i == 0) {
        //             n = n/i;
        //         }
        //     }
        // }
        // if(n != 1) {
        //     prime_factors.add(n);
        // }
        // // System.out.println("Prime Factors of" + " " + dup + ":-" + " " + prime_factors);
        // System.out.printf("Prime Factors of %d :- %s%n", dup, prime_factors);
         



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


        // double x = -3;
        // double n = 5;
        // double m = n;

        // double ans = 1;

        // while(n > 0) {
        //     if(n % 2 == 1) {
        //         ans = ans * x;
        //         n = n - 1;
        //     }
        //     else {
        //         n = n / 2;
        //         x = x * x;
        //     }
        // }
        // if(m < 0) {
        //     ans = 1/ans;
        // }

        
        // System.out.println(ans);
        

        // // Sieve of Eratosthenes...
        int n = 30;
        int[] prime = new int[n+1];
        
        for (int i = 0; i <= n; i++) {
            prime[i] = 1;
        }
        
        prime[0] = prime[1] = 0;


        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == 1) {
                for(int j = i*i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
