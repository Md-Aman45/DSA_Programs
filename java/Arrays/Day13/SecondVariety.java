package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondVariety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        while (i < pos.size()) {
            arr[k++] = pos.get(i++);
        }

        while (j < neg.size()) {
            arr[k++] = neg.get(j++);
        }

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    

        sc.close();
    }
}
