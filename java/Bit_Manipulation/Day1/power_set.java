package Bit_Manipulation.Day1;
import java.util.*;

public class power_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " +  n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        List<List<Integer>> result = getSubsets(arr, n);

        System.out.println("All subsets: ");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        sc.close();
    }


    static List<List<Integer>> getSubsets(int[] arr, int n) {

        List<List<Integer>> result = new ArrayList<>();

        int total = 1 << n;

        for (int num = 0; num < total; num++) {
            List<Integer> subset = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    subset.add(arr[i]);
                }
            }
            result.add(subset);
        }

        return result;
    }
}
