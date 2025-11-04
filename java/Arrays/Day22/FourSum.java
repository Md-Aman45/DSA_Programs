package Day22;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter target: ");
        int target = sc.nextInt();



        // -------- BRUTE APPROACH FOR 4 SUM --------
        // HashSet<List<Integer>> st = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             for (int l = k + 1; l < n; l++) {
        //                 long sum = (long) arr[i] + arr[j];
        //                 sum += arr[k];
        //                 sum += arr[l];

        //                 if (sum == target) {
        //                     List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
        //                     Collections.sort(temp);
        //                     st.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }








        // -------- BETTER APPROACH --------
        // HashSet<List<Integer>> st = new HashSet<>();

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         HashSet<Integer> hash = new HashSet<>();
        //         for (int k = j + 1; k < n; k++) {
        //             long sum = (long) arr[i] + arr[j] + arr[k];

        //             long l = (long) target - sum;

        //             if (hash.contains((int) l)) {
        //                 List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) l);
        //                 Collections.sort(temp);
        //                 st.add(temp);
        //             }

        //             hash.add(arr[k]);
        //         }
        //     }
        // }








        // -------- OPTIMAL APPROACH --------
        Arrays.sort(arr);
        List<List<Integer>> st = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && arr[j] == arr[ j - 1]) continue;

                int k = j + 1;
                int l = n - 1;

                while ( k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        st.add(temp);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;



                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }





        // Print the result...
        if (st.isEmpty()) {
            System.out.println("No 4 sum found that sum to " + target + " " + ":- {}");
        } else {
            System.out.println("4 Sum that sum to " + target + " " + ":-");
            for (List<Integer> ans : st) {
                System.out.println(ans);
            }
        }

        sc.close();
    }
}