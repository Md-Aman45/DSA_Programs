package recursions_backtrackings.Day1;
import java.util.*;


public class BasicRec {

    /* 
    // (1) Print Name N Times...
    public static void nTimes(int i, int n) {
        if (i > n) return;

        System.out.println("Aman");

        nTimes(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        nTimes(1, n);

        sc.close();
    }
    */


/* 
    (2) Print Linearly from 1 to n...
    public static void Linearly(int i, int n) {
        if (i > n) return;

        System.out.println(i);
        Linearly(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        Linearly(1, n);

        sc.close();
    }
*/



/*
    // (3) Print from n to 1...
    public static void ntoOne(int i, int n) {
        if (i < 1) return;

        System.out.println(i);

        ntoOne(i - 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        ntoOne(n, n);

        sc.close();
    }
*/




/* 
    // (4) Print Lineearly but using backtrack...
    public static void LinearlyBack(int i, int n) {
        if (i < 1) return;

        LinearlyBack(i - 1, n);

        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        LinearlyBack(n, n);

        sc.close();
    }
*/


    // (5) print from n to 1 using backtrack...
    public static void ntoOneBack(int n) {
        if (n < 1) return;
        
        ntoOneBack(n - 1);
        System.out.println(n);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        ntoOneBack(n);
    }

}
