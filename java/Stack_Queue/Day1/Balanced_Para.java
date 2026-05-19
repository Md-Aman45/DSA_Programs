package Stack_Queue.Day1;
import java.util.*;


public class Balanced_Para {

    public static String balanced(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);


            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.empty()) return "Not Balanced";

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                        return "Not Balanced";
                }
            }
        }

        if (st.empty()) {
            return "Balanced";
        }
        return "Not Balanced";
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.println(balanced(s));
    }
}
