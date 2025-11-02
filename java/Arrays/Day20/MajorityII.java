import java.util.*;

public class MajorityII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }





        // -------- BRUTE APPROACH --------
        // List<Integer> ls = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     if (ls.contains(arr[i])) continue;


        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] == arr[i]) {
        //             cnt++;
        //         }
        //     }

        //     if (cnt > n / 3) {
        //         ls.add(arr[i]);
        //     }

        //     if (ls.size() == 2) break;
        // }

        // System.out.println("Elements appearing more than n/3 times: " + ls);







        // -------- BETTER APPROACH --------
        // // using hashmap
        // List<Integer> ls = new ArrayList<>();
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // int mini = (n / 3) + 1;

        // for (int i = 0; i < n; i++) {
        //     mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);

        //     if (mpp.get(arr[i]) == mini) {
        //         ls.add(arr[i]);
        //     }
        // }

        // System.out.println("Elements appearing more than n/3 times: " + ls);







        // -------- OPTIMAL APPROACH --------
        int cnt1 = 0, cnt2 = 0;
        int el1 = -1, el2 = -1;

        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && arr[i] != el2) {
                cnt1 = 1; el1 = arr[i];
            }
            else if(cnt2 == 0 && arr[i] != el1) {
                cnt2 = 1; el2 = arr[i];
            }
            else if(el1 == arr[i]) cnt1++;
            else if(el2 == arr[i]) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;
        for (int num : arr) {
            if (num == el1) cnt1++;
            else if (num == el2) cnt2++;
        }

        List<Integer> res = new ArrayList<>();
        if (cnt1 > n / 3) res.add(el1);
        if (cnt2 > n / 3) res.add(el2);


        System.out.println("Elements appearing more than n/3 times: " + res);


        sc.close();
    }
}
