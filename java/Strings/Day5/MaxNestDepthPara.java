package Day5;

import java.util.*;

public class MaxNestDepthPara {
    public int isMaximumNesting(String s) {
        int currOpen = 0;
        int maxOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                currOpen++;
            else if (ch == ')')
                currOpen--;

            maxOpen = Math.max(maxOpen, currOpen);
        }

        return maxOpen;
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        MaxNestDepthPara obj = new MaxNestDepthPara();
        int depth = obj.isMaximumNesting(s);

        System.out.println("Maximum nesting depth: " + depth);

        sc.close();
    }

}
