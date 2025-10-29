package Day16;
import java.util.*;

public class LConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // // brute approach for (Longest Consecutive Sequence in an array)...
        // int longest = 1;
        // for (int i = 0; i < n; i++) {
        //     int x = arr[i];
        //     int cnt = 1;

        //     while(ls(arr, x + 1) == true) {
        //         x = x + 1;
        //         cnt++;
        //     }

        //     longest = Math.max(longest, cnt);
        // }

        // System.out.println("Longest Consecutive Sequence length = " + longest);






        // // better approach...
        // Arrays.sort(arr);
        // int longest = 1;
        // int currCnt = 0;
        // int lastSmallest = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] - 1 == lastSmallest) {
        //         currCnt++;
        //         lastSmallest = arr[i];
        //     } else if(arr[i] != lastSmallest) {
        //         currCnt = 1;
        //         lastSmallest = arr[i];
        //     }
        //     longest = Math.max(longest, currCnt);
        // }


        // System.out.println("Longest Consecutive Sequence length with better approach = " + longest);






        // // optimal approach...
        HashSet<Integer> st = new HashSet<>();
        
        for (int num : arr) {
            st.add(num);
        }

        int longest = 0;

        for (int num : st) {
            if (!st.contains(num - 1)) {
                int x = num;
                int cnt = 1;

                while (st.contains(x + 1)) {
                    x = x + 1;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }
        System.out.println("Longest Consecutive Sequence length with optimal approach = " + longest);


        sc.close();
    }










    // // this linear search code is for brute approach...
    // public static boolean ls(int arr[], int num) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == num) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}