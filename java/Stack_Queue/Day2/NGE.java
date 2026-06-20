package Stack_Queue.Day2;
import java.util.*;


public class NGE {

    public static List<Integer> findNGE(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) st.pop();

            if (st.isEmpty()) nge[i] = -1;
            else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        List<Integer> res = new ArrayList<>();
        for (int num : nge) {
            res.add(num);
        }

        return res;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> ans = findNGE(arr);
        System.out.print("ans:- " + ans);

        sc.close();


    }
}