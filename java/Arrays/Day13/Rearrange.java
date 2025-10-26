package Day13;
import java.util.*;

public class Rearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // // brute approach...
        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();


        // for (int num : arr) {
        //     if (num >= 0) pos.add(num);
        //     else neg.add(num);
        // }

        // for (int i = 0; i < pos.size() && i < neg.size(); i++) {
        //     arr[2 * i] = pos.get(i);
        //     arr[2 * i + 1] = neg.get(i);
        // }

        // System.out.println("Rearranged Array: " + Arrays.toString(arr));




        // // optimal approach...
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans.set(neg, arr[i]);
                neg += 2;
            } else {
                ans.set(pos, arr[i]);
                pos += 2;
            }
        }

        System.out.println("Rearranged Array with optimal: " + ans);


        sc.close();
    }
}