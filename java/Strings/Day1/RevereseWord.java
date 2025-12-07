package Day1;
import java.util.*;

public class RevereseWord {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        RevereseWord obj = new RevereseWord();
        String ans = obj.reverseWords(input);

        System.out.print("Reverse words: " + ans);

        sc.close();
    }
}
