package Day1;
import java.util.*;

public class S_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                arr[i] = largest;
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        System.out.println("Second Largest Number is: " + slargest);

        sc.close();
    }
}
