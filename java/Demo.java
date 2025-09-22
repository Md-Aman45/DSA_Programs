import java.util.Scanner;

// // RevNum + Palindrome...
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int count = 0;
        int revNum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            count++;
            n = n / 10;
            revNum = revNum * 10 + lastDigit;
        }
        if(dup == revNum) {
            System.out.println("Is no. is palindrome:- Yes");
        } else {
            System.out.println("Is no. is palindrome:- No");
        }

        System.out.println("No.:- " + count);
        System.out.print("RevNum:- " + revNum);
    }
}

// //  Logs...
// public class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int count;
//         if (n == 0) {
//             count = 1;
//         } else {
//             count = (int)(Math.log10(n)) + 1;
//         }
//         System.out.println("Number of digits: " + count);
//         sc.close();
//     }
// }
