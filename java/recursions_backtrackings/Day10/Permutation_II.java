package recursions_backtrackings.Day10;

import java.util.*;

public class Permutation_II {
    private static void recurPermute_(int ind, int[] arr, List<List<Integer>> ans) {
        if (ind == arr.length) {
            List<Integer> ds = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }

            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            swap(i, ind, arr);
            recurPermute_(ind + 1, arr, ans);
            swap(i, ind, arr);
        }
    }


    public static void swap(int i, int j, int[] arr) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = new ArrayList<>();
        recurPermute_(0, arr, ans);

        System.out.print("Permutations:");
        for (List<Integer> perm : ans) {
            System.out.println(perm);
        }

        sc.close();
    }
}