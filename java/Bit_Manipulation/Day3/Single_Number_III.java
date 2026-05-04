package Bit_Manipulation.Day3;
import java.util.*;

public class Single_Number_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int[] res = single(arr);
        System.out.print("Single numbers are: " + Arrays.toString(res));


        sc.close();
    }


    public static int[] single(int[] arr) {
        // int n = arr.length;


        // brute force approach...
        // HashMap<Integer, Integer> mpp = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        // }

        // ArrayList<Integer> ans = new ArrayList<>();

        // for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
        //     if (it.getValue() == 1) {
        //         ans.add(it.getKey());
        //     }
        // }


        // return new int[]{ans.get(0), ans.get(1)};





        // optimal approach...
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int rightMost = xor & -xor;
        int x = 0;
        int y = 0;

        for (int num : arr) {
            if ((num & rightMost) != 0) {
                x ^= num;
            }
            else {
                y ^= num;
            }
        }

        return new int[]{x, y};
    }
}