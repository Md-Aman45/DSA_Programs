package Day3;
import java.util.*;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = s.charAt(i);


            // Check mapping S -> T...
            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) return false;
            }
            else {
                mapST.put(charS, charT);
            }

            // Check mapping T -> S...
            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) return false;
            }
            else {
                mapTS.put(charT, charS);
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        IsomorphicStrings obj = new IsomorphicStrings();
        boolean result = obj.isIsomorphic(s, t);

        if (result) {
            System.out.println("Result: The strings ARE isomorphic.");
        } else {
            System.out.println("Result: The strings are NOT isomorphic.");
        }

        sc.close();
    }
}