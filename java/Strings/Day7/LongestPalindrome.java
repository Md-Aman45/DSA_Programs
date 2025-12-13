package Day7;
import java.util.*;

public class LongestPalindrome {
    public String longestPalindrome(String str) {
        if (str == null || str.length() <= 1) return str;

        int start = 0, maxLen = 1;

        for (int i = 0; i < str.length(); i++) {
            int low = i, high = i;

            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLen)  {
                    start = low;
                    maxLen = high - low + 1;
                }
                low--;
                high++;
            }

            low = i;
            high = i + 1;

            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    start = low;
                    maxLen = high - low + 1;
                }
                low--;
                high++;
            }
        }
        return str.substring(start, start + maxLen);
    }



    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LongestPalindrome obj = new LongestPalindrome();
        String result = obj.longestPalindrome(input);

        System.out.println("Longest Palindromic Substring: " + result);

        sc.close();
    }
}