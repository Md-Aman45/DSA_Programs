package recursions_backtrackings.Day8;
import java.util.*;

public class Sum_II {
    public static void findCombinations(int ind, int[] arr, int tar, List<List<Integer>> ans, List<Integer> ds) {
        if (tar == 0) {
            ans.add(new ArrayList<>(ds));
            System.out.println(ds);
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > tar) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, tar - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter target: ");
        int tar = sc.nextInt();

        List<List<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> ds = new ArrayList<>();


        findCombinations(0, arr, tar, ans, ds);

        sc.close();
    }
}
