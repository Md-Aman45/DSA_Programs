package recursions_backtrackings.Day15;
import java.util.*;

public class PermuteSequence {
    public static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        StringBuilder ans = new StringBuilder();
        k = k - 1;
        while (true) {
            ans.append(numbers.get(k / fact));
            numbers.remove(k / fact);
            if (numbers.size() == 0) break;

            k = k % fact;
            fact = fact / numbers.size();
        }

        return ans.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        String res = getPermutation(n, k);

        System.out.print("res: " + res);

        

    }
}