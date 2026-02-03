package recursions_backtrackings.Day9;
import java.util.*;

public class SubSet_II {
    public static void  findSubsets(int ind, int[] arr, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));

        for (int i = ind; i < arr.length; i++) {
            if (i != ind && arr[i] == arr[i - 1]) continue;

            ds.add(arr[i]);
            findSubsets(i + 1, arr, ds, ansList);
            ds.remove(ds.size() - 1);
        }
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

        Arrays.sort(arr);

        List<List<Integer>> ansList = new ArrayList<>();

        findSubsets(0, arr, new ArrayList<>(), ansList);

        System.out.print("Susbset without duplicates: ");
        for (List<Integer> subset : ansList) {
            System.out.print(subset + " ");
        }

        sc.close();
    }
}





