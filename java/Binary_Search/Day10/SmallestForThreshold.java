package Day10;
import java.util.*;

public class SmallestForThreshold {

    // public int smallOfDiv(int[] arr, int threshold) {
    //     int maxi = Integer.MIN_VALUE;

    //     for (int i = 0; i < arr.length; i++) {
    //         maxi = Math.max(maxi, arr[i]);
    //     }




    //     // ---------- Linear Search ----------
    //     for (int d = 1; d <= maxi; d++) {
    //         int sum = 0;

    //         for (int i = 0; i < arr.length; i++) {
    //             sum += Math.ceil((double) arr[i]/ d);
    //         }

    //         if (sum <= threshold) {
    //             return d;
    //         }
    //     }

    //     return -1;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter no. of arr: ");
    //     int n = sc.nextInt();

    //     int[] arr = new int[n];
    //     System.out.print("Enter the numbers: ");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        

    //     System.out.print("Enter threshold: ");
    //     int threshold = sc.nextInt();

    //     SmallestForThreshold thres = new SmallestForThreshold();

    //     int ans = thres.smallOfDiv(arr, threshold);

    //     System.out.println("Smallest Divisor = " + ans);


    //     sc.close();
    // }







    public int sumByDiv(int[] arr, int div) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) arr[i] / (double) div);
        }

        return sum;
    }


    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }



        // ---------- Binary Search ----------
        int low = 1, high = maxi;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sumByDiv(arr, mid) <= threshold) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        SmallestForThreshold obj = new SmallestForThreshold();
        int ans = obj.smallestDivisor(arr, threshold);

        System.out.println("Smallest Divisor = " + ans);


        sc.close();
    }
}
