package Day4;
import java.util.*;

public class AnagramString {
    public boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        if (str1.length() != str2.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            counts[ch - 'a']++;
        }


        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            counts[ch - 'a']--;
        }


        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }




    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        AnagramString obj = new AnagramString();
        boolean result = obj.isAnagram(s1, s2);

        if (result) {
            System.out.println("Result: The strings ARE anagrams.");
        } else {
            System.out.println("Result: The strings are NOT anagrams.");
        }

        sc.close();
    }
}