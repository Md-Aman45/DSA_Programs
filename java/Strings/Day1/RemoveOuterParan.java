package Day1;

import java.util.*;

public class RemoveOuterParan {
    public String removeParanthesis(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (cnt > 0)
                    ans.append(ch);
                cnt++;
            } else {
                cnt--;
                if (cnt > 0)
                    ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String input = sc.next().trim();

        RemoveOuterParan obj = new RemoveOuterParan();
        String result = obj.removeParanthesis(input);

        System.out.println("Result after removing outer parentheses: " + result);

        sc.close();
    }
}