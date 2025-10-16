/*  Left Rotate the Array by one place... */

// package Day3;
// import java.util.*;

// public class Left_Rotate {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int n = arr.length;

//         int temp = arr[0];

//         for (int i = 1; i < n; i++) {
//             arr[i - 1] = arr[i];
//         }

//         arr[n - 1] = temp;

//         System.out.println("Rotated Array: " + Arrays.toString(arr));
//     }
// }




/* Left Rotate the array by d palces... */

// package Day3;
// import java.util.*;

// public class Left_Rotate {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};

//         int n = arr.length;

//         int d = 4;
//         d = d % n;
//         int[] temp = new int[d];
        
//         for (int i = 0; i < d; i++) {
//             temp[i] = arr[i];
//         }

//         for (int i = d; i < n; i++) {
//             arr[i - d] = arr[i];
//         }

//         for (int i = n - d; i < n; i++) {
//             arr[i] = temp[i - (n - d)];
//         }


//         System.out.print("Array after left rotation by " + d + " positions:");
//         System.out.print(Arrays.toString(arr));
//     }
// }



// Optimal Approach...
package Day3;
import java.util.*;

public class Left_Rotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int n = arr.length;

        int d = 7;
        d = d % n;

        reverse(arr, 0, d -1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("Rotated Array:" + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}