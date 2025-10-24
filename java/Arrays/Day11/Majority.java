package Day11;
import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }




        // // better approach (using hashing)...
        // int hash[] = new int[100];

        // for (int i = 0; i < n; i++) {
        //     hash[arr[i]]++;
        // }

        // System.out.println("Frequency of each number:");
        // for (int i = 0; i < hash.length; i++) {
        //     if (hash[i] > 0) {
        //         System.out.println("el " + i + " -> " + hash[i] + " " + "value");
        //     }
        // }






        // // better approach (using hashMap)...
        // HashMap <Integer, Integer> mpp = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        // }

        // boolean found = false;

        // for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
        //     if (entry.getValue() > n / 2) {
        //         System.out.print("Majority element: " + entry.getKey());
        //         found = true;
        //         break;
        //     }
        // }

        // if (!found) {
        //     System.out.println("No majority element found.");
        // }






        // // optimal approach...
        int cnt = 0;
        int el = -1;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) cnt1++;
        }

        if (cnt1 > n / 2) {
            System.out.print("Majority element: " + el);
        } else {
            System.out.println("No majority element found.");
        }

        
        sc.close();
    }
}