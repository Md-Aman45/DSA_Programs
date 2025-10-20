package Day7;
import java.util.*;

public class Once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // // brute approach...
        // for (int i = 0; i < n; i++) {
        //     int num = arr[i];
        //     int cnt = 0;

        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] == num) {
        //             cnt++;
        //         }
        //     }

        //     if (cnt == 1) {
        //         System.out.println("Once: " + num);
        //     }
        // }



        // // better approach (using hashing)...
        // int maxi = arr[0];
        // for (int i = 0; i < n; i++) {
        //     maxi = Math.max(maxi, arr[i]);
        // }

        // int hash[] = new int[maxi + 1];

        // for (int i = 0; i < n; i++) {
        //     hash[arr[i]]++;
        // }

        // for (int i = 0; i < n; i++) {
        //     if (hash[arr[i]] == 1) {
        //         System.out.println("Once by better: " + arr[i]);
        //     }
        // }



        // // better approach (using map)...
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         System.out.println("Once by better with map: " + entry.getKey());
        //     }
        // }



        // // optimal approach (xor -> only for one unique no.)...
        int XOR = 0;
        for (int i = 0; i < n; i++) {
            XOR ^= arr[i];
        }
    
        System.out.println("Once by optimal: " + XOR);


        sc.close();
    }
}