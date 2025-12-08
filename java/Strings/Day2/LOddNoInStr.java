package Day2;

import java.util.*;

public class LOddNoInStr {
    public String LargestOddNumInStr(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);

            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numeric string: ");
        String input = sc.nextLine();

        LOddNoInStr obj = new LOddNoInStr();

        String ans = obj.LargestOddNumInStr(input);

        // System.out.println("Largest odd number in String: " + ans);
        if (ans.equals("")) {
            System.out.println("Largest odd number in string: NONE");
        } else {
            System.out.println("Largest odd number in String: " + ans);
        }

        sc.close();
    }
}