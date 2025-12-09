package Day3;
import java.util.*;

public class RotationString {
    public boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        String concat = s1 + s1;
        
        // Check if s2 exists inside concat...
        return concat.contains(s2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        RotationString obj = new RotationString();
        boolean result = obj.areRotations(s1, s2);

        if (result) {
            System.out.println("Result: The strings ARE rotations of each other.");
        } else {
            System.out.println("Result: The strings are NOT rotations of each other.");
        }

        sc.close();
    }
}