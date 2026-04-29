package Bit_Manipulation.Day1;
import java.util.*;


public class single_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int res = single_number_I(arr);

        System.out.print("single number is: " + res);

        

    }



    static int single_number_I(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        return xor;
    }
}
