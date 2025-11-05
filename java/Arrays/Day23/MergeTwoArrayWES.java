package Day23;
import java.util.*;

public class MergeTwoArrayWES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arr1: ");
        int n = sc.nextInt();

        System.out.print("Enter the size of arr2: ");
        int m = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers from arr1: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter " + m + " " + "numbers from arr2: ");
        int[] arr2 = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }




        // -------- BRUTE APPROACH FOR MERGE 2 SORTED ARRAY WITH USING EXTRA SPACE(WES)  ---------
        // int[] arr3 = new int[n + m];
        // int left = 0, right = 0;
        // int index = 0;

        // while (left < n && right < m) {
        //     if (arr1[left] <= arr2[right]) {
        //         arr3[index] = arr1[left];
        //         left++; index++;
        //     } else {
        //         arr3[index] = arr2[right];
        //         right++; index++;
        //     }
        // }

        // while (left < n) {
        //     arr3[index++] = arr1[left++];
        // }

        // while (right < m) {
        //     arr3[index++] = arr2[right++];
        // }

        // for (int i = 0; i < n + m; i++) {
        //     if (i < n) {
        //         arr1[i] = arr3[i];
        //     } else {
        //         arr2[i - n] = arr3[i];
        //     }
        // }







        // -------- FIRST OPTIMAL APPROACH FOR MERGE 2 SORTED ARRAY WITHOUT USING EXTRA SPACE(WES) ---------
        // int left = n - 1, right = 0;

        // while (left >= 0 && right < m) {
        //     if (arr1[left] > arr2[right]) {
        //         swap(arr1, arr2, left, right);
        //         left--; right++;
        //     } else {
        //         break;
        //     }
        // }

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);






        // -------- SECOND OPTIMAL APPROACH FOR MERGE 2 SORTED ARRAY WITHOUT USING EXTRA SPACE(WES) ---------
        // // Usign gap method (shell sort)
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // arr1 and arr2...
                if (left < n && right >= n) {
                    if (arr1[left] > arr2[right - n]) {
                        swap(arr1, arr2, left, right - n);
                    }
                }

                // arr2 and arr2...
                else if (left >= n) {
                    if (arr2[left - n] > arr2[right - n]) {
                        swap(arr2, arr2, left - n, right - n);
                    }
                }

                // arr1 and arr1...
                else {
                    if (arr1[left] > arr1[right]) {
                        swap(arr1, arr1, left, right);
                    }
                }

                left++; right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }







        // Print results
        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));

        sc.close();
    }

    
    // swap function...
    public static void swap(int[] arr1, int[] arr2, int left, int right) {
        int temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
    }
}