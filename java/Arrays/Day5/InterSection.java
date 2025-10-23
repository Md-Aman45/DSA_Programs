// // Brute approach for intersection of two sorted array...
// package Day5;
// import java.util.*;

// public class InterSection {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of n1 array: ");
//         int n1 = sc.nextInt();

//         int A[] = new int[n1];
//         System.out.print("Enter " + n1 + " " + "numbers for n1 array: ");
//         for (int i = 0; i < n1; i++) {
//             A[i] = sc.nextInt();
//         }

//         System.out.print("Enter the size of n2 array: ");
//         int n2 = sc.nextInt();

//         int B[] = new int[n2];
//         System.out.print("Enter " + n2 + " " + "numbers for n1 array: ");
//         for(int i = 0; i < n2; i++) {
//             B[i] = sc.nextInt();
//         }

//         int[] visi = new int[n2];
//         List<Integer> ans = new ArrayList<>();

//         for (int i = 0; i < n1; i++) {
//             {
//                 for(int j = 0; j < n2; j++) {
//                     if (A[i] == B[j] && visi[j] == 0) {
//                         ans.add(A[i]);
//                         visi[j] = 1;
//                         break;
//                     }

//                     if (B[j] > A[i]) break;
//                 }
//             }
//         }
//         System.out.print("Intersection: " + ans);
//     }
// }



// // Optimal approach...
package Day5;
import java.util.*;

public class InterSection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of n1 array: ");
        int n1 = sc.nextInt();

        int A[] = new int[n1];
        System.out.print("Enter " + n1 + " " + "numbers for n1 array: ");
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the size of n2 array: ");
        int n2 = sc.nextInt();

        int B[] = new int[n2];
        System.out.print("Enter " + n2 + " " + "numbers for n2 array: ");
        for (int j = 0; j < n2; j++) {
            B[j] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] > B[j]) {
                j++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != A[i]) {
                    ans.add(A[i]);
                }
                i++;
                j++;
            }
        }

        System.out.print("Intesection: " + ans);

        sc.close();
    }
}