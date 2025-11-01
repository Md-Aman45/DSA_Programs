package Day19;
import java.util.*;


// ------------------- PASCAL TRIANGLE -------------------                     

// ------- Q1) Given row and column, find the element at that place...    (ex :- r = 5, c = 3, ans = 6 ) --------

// public class PascalTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter row number (rows): ");
//         int n = sc.nextInt();

//         System.out.print("Enter column number (cols): ");
//         int r = sc.nextInt();
        

//         // Since Pascal's triangle rows & columns are usually 1-indexed:
//         // Element at (n, r) = nCr = n! / (r! * (n - r)!)
//         // But we can calculate efficiently without factorials:
//         int ans = nCr(n - 1, r - 1);

//         System.out.println("Element at (" + n + ", " + r + ") is: " + ans);
//         sc.close();
//     }


//     // for question 1...
//     public static int nCr(int n, int r) {
//         int res = 1;
//         for (int i = 0; i < r; i++) {
//             res = res * (n - i);
//             res = res / (i + 1);
//         }
//         return res;
//     }
// }








// --------- Q2) Print any num of row of pascal triangle.  (ex:- n = 5, ans = 1 4 6 4 1) -----------
// public class PascalTriangle {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter row number (rows): ");
//         int n = sc.nextInt();


//         // -------- BRUTE APPROACH --------
//         // for (int c = 1; c <= n; c++) {
//         //     System.out.print(nCr(n - 1, c- 1) + " ");
//         // }



//         // -------- OPTIMAL APPROACH --------
//         long ans = 1;
//         System.out.print(ans + " ");

//         for (int i = 1; i < n; i++) {
//             ans = ans * (n - i);
//             ans = ans / i;
//             System.out.print(ans + " ");
//         }


//         sc.close();
//     }


//     // -------- BRUTE APPROACH --------
//     // public static int nCr(int n, int r) {
//     //     int res = 1;
//     //     for (int i = 0; i < r; i++) {
//     //         res = res * (n - i);
//     //         res = res / (i + 1);
//     //     }
//     //     return res;
//     // }
// }




// ---------- Q3) Given n, print the entire pascal triangle --------------
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        ArrayList<List<Long>> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(generateRow(i));
        }

        for (List<Long> row : ans) {
            for (Long val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();

    }

    // -------- OPTIMAL APPROACH --------
    public static List<Long> generateRow(int n) {
        ArrayList<Long> row = new ArrayList<>();
        long ans = 1;
        row.add(ans);

        for (int col = 1; col < n; col++) {
            ans = ans * (n - col);
            ans = ans / col;
            row.add(ans);
        }

        return row;
    }

}