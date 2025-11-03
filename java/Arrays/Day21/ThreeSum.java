package Day21;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // -------- BRUTE APPROACH FOR 3 SUM --------
        // HashSet<List<Integer>> res = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             if (arr[i] + arr[j] + arr[k] == 0) {
        //                 List<Integer> set = Arrays.asList(arr[i], arr[j], arr[k]);
        //                 Collections.sort(set);
        //                 res.add(set);
        //             }
        //         }
        //     }
        // }

        // // Print the result...
        // if (res.isEmpty()) {
        //     System.out.println("No 3 sum found that sum to 0:- {}");
        // } else {
        //     System.out.println("3 Sum that sum to 0:-");
        //     for (List<Integer> set : res) {
        //         System.out.println(set);
        //     }
        // }






        // -------- BETTER APPROACH --------
        // Set<List<Integer>> st = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        //     HashSet<Integer> hash = new HashSet<>();

        //     for (int j = i + 1; j < n; j++) {
        //         int k = - (arr[i] + arr[j]);

        //         if (hash.contains(k)) {
        //             List<Integer> triplet = Arrays.asList(arr[i], arr[j], k);
        //             Collections.sort(triplet);
        //             st.add(triplet);
        //         } else {
        //             hash.add(arr[j]);
        //         }
        //     }
        // }


        // // print the result...
        // if (st.isEmpty()) {
        //     System.out.println("No 3 sum found that sum to 0:- {}");
        // } else {
        //     System.out.println("3 Sum that sum to 0:-");
        //     for (List<Integer> res : st) {
        //         System.out.println(res);
        //     }
        // }






        // -------- OPTIMAL APPROACH --------
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }



        // print the result...
        if (ans.isEmpty()) {
            System.out.println("No 3 sum found that sum to 0:- {}");
        } else {
            System.out.println("3 Sum that sum to 0:-");
            for (List<Integer> res : ans) {
                System.out.println(res);
            }
        }

        sc.close();
    }
}
