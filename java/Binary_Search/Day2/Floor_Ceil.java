package Day2;
import java.util.*;

public class Floor_Ceil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter x: ");
        int x = sc.nextInt();




        // ---------- Floor ----------
        // floor -> largest no. in array <= x....
        // int floor = -1;
        // int low = 0, high = n - 1;

        // while (low <= high) {
        //     int mid = (low + high) / 2;

        //     if (arr[mid] <= x) {
        //         floor = arr[mid];
        //         low = mid + 1;
        //     }
        //     else {
        //         high = mid - 1;
        //     }
        // }

        // System.out.println("Floor = " + floor);






        // ---------- Ceil ----------
        // ceil -> smallest no. in array >= x...
        int low = 0, high = n - 1;
        int ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;


            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println("Ceil = " + ceil);

        sc.close();

    }
}
