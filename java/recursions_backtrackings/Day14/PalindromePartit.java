package recursions_backtrackings.Day14;
import java.util.*;

public class PalindromePartit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");

        String s = sc.nextLine();


        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();

        func(0, s, path, res);
        System.out.print("res: " + res);

        sc.close();
    }


    private static void func(int ind, String s, List<String> path, List<List<String>> res) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(s, ind, i)) {
                path.add(s.substring(ind, i + 1));
                func(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }


    private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }

        return true;
    }
}
