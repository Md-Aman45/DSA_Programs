package Day1;
import java.util.*;

public class Smalest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        
        // for (int i = 1; i < n; i ++) {
        //     if (arr[i] < smallest) {
        //         smallest = arr[i];
        //     }
        // }

        // System.out.println("Smallest number is: " + smallest);


        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        System.out.print("Second Smallest number is: " + ssmallest);

    }
}
