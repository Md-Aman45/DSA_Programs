package Day2;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            ans.append(first[i]);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter the strings one by one: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String prefix = obj.longestCommonPrefix(arr);

        if (prefix.equals("")) {
            System.out.println("Longest Common Prefix: \"\"");
        } else {
            System.out.println("Longest Common Prefix: " + prefix);
        }


        sc.close();
    }
}