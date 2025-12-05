package Day15;

import java.util.*;

public class KthElement {
    public int kthelement(int[] arr1, int[] arr2, int n1, int n2, int k) {
        if (n1 > n2)
            return kthelement(arr2, arr1, n2, n1, k);

        int low = Math.max(k - n2, 0);
        int high = Math.min(k, n1);


        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = k - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : arr1[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : arr2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Enter " + n1 + " sorted elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.print("Enter " + n2 + " sorted elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter k (1-based index): ");
        int k = sc.nextInt();

        KthElement ke = new KthElement();
        int ans = ke.kthelement(arr1, arr2, n1, n2, k);

        System.out.println("The " + k + "-th smallest element is = " + ans);


        sc.close();
    }

}