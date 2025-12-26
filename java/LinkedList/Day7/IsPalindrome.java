package Day7;
import java.util.*;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}




public class IsPalindrome {
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        

        // Brute approach...
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.data != st.peek()) return false;

            temp = temp.next;
            st.pop();
        }

        return true;
    }






    // MAIN METHOD...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, prev = null;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
            } else {
                prev.next = newNode;
                newNode.back = prev;
            }
            prev = newNode;
        }

        boolean result = isPalindrome(head);

        if (result)
            System.out.println("Linked List is a Palindrome");
        else
            System.out.println("Linked List is NOT a Palindrome");

        sc.close();
    }
}