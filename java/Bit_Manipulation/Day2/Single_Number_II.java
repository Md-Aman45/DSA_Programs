package Bit_Manipulation.Day2;
import java.util.*;

public class Single_Number_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = single(arr);
        System.out.print("Single number is: " + res);

        sc.close();
        
    }


    public static int single(int[] arr) {
        int n = arr.length;

        // first approach...
        // HashMap<Integer, Integer> mpp = new HashMap<>();

        // for (int i = 0; i < n - 1; i++) {
        //     mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        // }


        // for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
        //     if (it.getValue() == 1) {
        //         return it.getKey();
        //     }
        // }

        // return -1;







        // second approach...
        // int ans = 0;
        // for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
        //     int cnt = 0;
        //     for (int i = 0; i < n; i++) {
        //         if ((arr[i] & (1 << bitIndex)) != 0) cnt++;

        //     }
        //     if (cnt % 3 == 1) {
        //         ans = ans | (1 << bitIndex);
        //     }
        // }
        // return ans;






        // third approach...
        // Arrays.sort(arr);

        // for (int i = 1; i < n; i = i + 3) {
        //     if (arr[i] != arr[i - 1]) {
        //         return arr[i - 1];
        //     }
        // }

        // return arr[n - 1];






        // fourth approach...
        int ones = 0, twos = 0;

        for (int i = 0; i < n; i++) {
            ones = (ones ^ arr[i]) & ~twos;
            twos = (twos ^ arr[i]) & ~ones;
        }
        return ones;

    }
}