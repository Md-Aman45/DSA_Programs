// package Day2;

// import java.util.Scanner;

// public class Sorted {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the Array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.print("Enter " + n + " " + "Numbers: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean isSorted = true;

//         for (int i = 1; i < n; i++) {
//             if (arr[i] < arr[i - 1]) {
//                 isSorted = false;
//                 break;
//             }
//         }

//         if (isSorted) {
//             System.out.println("The Array is sorted in ascending order.");
//         } else {
//             System.out.println("The Array is not sorted");  
//         }


//         System.out.println("Array elements: ");
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }

//         System.out.println();

//         sc.close();
//     }
// }



// // Optimal Approach...
// Remove duplicates in-place from sorted array
package Day2;
import java.util.*;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter" + n + " " + "numbers: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if ( n == 0) {
            System.out.print("Array is empty!");
            sc.close();
            return;
        }

        int i = 0;
        for(int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        System.out.println("Number of unique elements: " + (i + 1));

        System.out.print("Unique elements are: ");
        for (int k = 0; k < i + 1; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}