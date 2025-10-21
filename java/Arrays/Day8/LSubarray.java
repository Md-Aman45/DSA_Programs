package Day8;
import java.util.*;

public class LSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // // Brute approach...
        // int len = 0;
        // int k = 3;
        // for (int i = 0; i < n; i++) {
        //     int s = 0;
        //     for (int j = i; j < n; j++) {
        //         s += arr[j];

        //         if (s == k) {
        //             len = Math.max(len, j - i + 1);
        //         }
        //     }
        // }

        // System.out.println(len);





        // // // better appraoch...
        // HashMap<Integer, Integer> preSumMap = new HashMap<>();

        // int sum = 0;
        // int maxLen = 0;
        // int k = 3;

        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        //     if (sum == k) {
        //         maxLen = i + 1;
        //     }

        //     int rem = sum - k;

        //     if (preSumMap.containsKey(rem)) {
        //         int len = i - preSumMap.get(rem);
        //         maxLen = Math.max(maxLen, len);
        //     }

        //     preSumMap.putIfAbsent(sum, i);
        // }

        // System.out.print("Longest subarray length (using HashMap) = " + maxLen);





        // // optimal approach...
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen = 0;
        int k = 6;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            
            if (right < n) {
                sum += arr[right];
            }
        }

        System.out.print("Longest subarray length (using optimal): " + maxLen);


        sc.close();

    }
}