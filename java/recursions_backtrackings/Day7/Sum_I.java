package recursions_backtrackings.Day7;
import java.util.*;

public class Sum_I {
    public static void findCombination(int ind, int[] arr, int tar, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (tar == 0) {
                ans.add(new ArrayList<>(ds));
                System.out.println(ds);
            }
            return;
        }

        if (arr[ind] <= tar) {
            ds.add(arr[ind]);
            findCombination(ind, arr, tar - arr[ind], ans, ds);

            ds.remove(ds.size() - 1);
        }
        findCombination(ind + 1, arr, tar, ans, ds);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arr: ");
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int tar = sc.nextInt();

        List<List<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> ds = new ArrayList<>();

        findCombination(0, arr, tar, ans, ds);


    }
}
