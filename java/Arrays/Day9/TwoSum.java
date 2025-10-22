package Day9;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");

        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter " + n + " " + "numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        // int target = 14;
        boolean found = false;

        
        // // Brute approach...
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] + arr[j] == target) {
        //             System.out.println("Values: " + arr[i] + "," + arr[j]);
        //             System.out.println("Indices: " + i + ", " + j);
        //             System.out.print("YES");
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (found) break;
        // }

        // if (!found) {
        //     System.out.println("-1, -1");
        //     System.out.print("NO");
        // }





        // // Better approach (using HashMap)...
        // HashMap<Integer, Integer> twoSum = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     int a = arr[i];
        //     int b = target - a;

        //     if (twoSum.containsKey(b)) {
        //         System.out.println("Values using HashMap: " + a + ", " + b);
        //         System.out.println("Indices: " + i + ", " + twoSum.get(b));
        //         System.out.println("YES");
        //         found = true;
        //         break;
        //     }

        //     twoSum.put(a, i);
        // }

        // if (!found) {
        //     System.out.println("-1, -1");
        //     System.out.println("NO");
        // }





        // // Optimal approach (using 2 pointer)...
        Arrays.sort(arr);

        int left = 0, right = n - 1;


        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Values (optimal): " + arr[left] + ", " + arr[right]);
                System.out.println("Indices: " + left + ", " + right);
                System.out.println("YES");
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("-1, -1");
            System.out.println("NO");
        }

        
    


        sc.close();
    }
}
