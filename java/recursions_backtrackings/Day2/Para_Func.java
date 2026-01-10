package recursions_backtrackings.Day2;

import java.util.*;

public class Para_Func {

    /*
     * // ---------- Parameterised ----------
     * // sum of first n numbers...
     * public static void sumOfN(int i, int sum) {
     * if (i < 1) {
     * System.out.println("result = " + sum);
     * return;
     * }
     * sumOfN(i - 1, sum + i);
     * }
     * 
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.print("Enter n = ");
     * int n = sc.nextInt();
     * 
     * sumOfN(n, 0);
     * 
     * sc.close();
     * }
     * 
     */


    


/* 
    // ----------- Funtional -----------
    // sum of first n numbers...
    public static int sumOfN(int n) {
        if (n == 0)
            return 0;

        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int result = sumOfN(n);

        System.out.println("result = " + result);


        sc.close();
    }
*/





/*
    // ---------- Parameterised ----------
    // Factorial of n numbers...
    public static void factOfN(int i, int mul) {
        if (i < 1) {
            System.out.println(mul);
            return;
        }

        factOfN(i - 1, mul * i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        factOfN(n, 1);

        sc.close();
    }
*/




    // ----------- Funtional -----------
    // Factorial of n numbers...
    public static int factOfN(int n) {
        if (n == 0) return 1;

        return n * factOfN(n - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");

        int n = sc.nextInt();

        int result = factOfN(n);

        System.out.println("result = " + result);

    }

}