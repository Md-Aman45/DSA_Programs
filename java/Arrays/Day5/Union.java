package Day5;

import java.util.*;

// // Union...
public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of n1 array: ");
        int n1 = sc.nextInt();

        int a[] = new int[n1];
        System.out.print("Enter " + n1 + " " + "numbers for n1 array: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of n2 array: ");
        int n2 = sc.nextInt();
        
        int b[] = new int[n2];
        System.out.print("Enter " + n2 + " " + "numbers for n2 array: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        // 2 pointer approach...
        int i = 0;
        int j = 0;

        ArrayList<Integer> unionArr = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }


        System.out.println("Union of the two arrays: " + unionArr);
        sc.close();
    }
}