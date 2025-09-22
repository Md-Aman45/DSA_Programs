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
