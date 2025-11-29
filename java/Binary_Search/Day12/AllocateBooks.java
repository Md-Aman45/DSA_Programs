package Day12;
import java.util.*;

public class AllocateBooks {
    public int countStudents(int[] arr, int pages) {
        int students = 1;
        long pagesStudent = (long) 0;

        for (int num : arr) {
            if (pagesStudent + num <= pages) {
                pagesStudent += num;
            }
            else {
                students++;
                pagesStudent = num;
            }
        }

        return students;
    }



    public int totalSum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;

        return total;
    }


    public int findPages(int[] arr, int n, int m) {
        if (m > n) return -1;


        int low = Arrays.stream(arr).max().getAsInt();
        int high = totalSum(arr);


        // ---------- Linear Search ----------
        // for (int pages = low; pages <= high; pages++) {
        //     int requiredStudents = countStudents(arr, pages);

        //     if (requiredStudents <= m) return pages;
        // }

        // return -1;







        // ---------- Binary Search ----------
        while (low <= high) {
            int mid = (low + high) / 2;

            int requireStudents = countStudents(arr, mid);

            if (requireStudents > m) low = mid + 1;
            
            else high = mid - 1;
        }
        return low;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter pages in each book: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter number of students: ");
        int m = sc.nextInt();


        AllocateBooks obj = new AllocateBooks();
        int ans = obj.findPages(arr, n, m);
        System.out.println("Minimum pages = " + ans);


        sc.close();
    }
}