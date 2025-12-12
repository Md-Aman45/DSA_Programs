package Day6;
import java.util.*;

public class ImplementAtoi {
    public int isAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();

        while (i < n && s.charAt(i) == ' ') i++;

        if (i == n) return 0;

        int sign = +1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }


        long ans = 0;
        int maxi = Integer.MAX_VALUE;
        int mini = Integer.MIN_VALUE;

        while (i < n && Character.isDigit(s.charAt(i))) {

            ans = ans * 10 + (s.charAt(i) - '0');

            if (sign == 1 && ans > maxi) return maxi;
            if (sign == -1 && -ans < mini) return mini;

            i++;
        }

        
        return (int)(ans * sign);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        ImplementAtoi obj = new ImplementAtoi();
        int result = obj.isAtoi(s);

        System.out.println("Converted Integer: " + result);

        sc.close();
    }
}