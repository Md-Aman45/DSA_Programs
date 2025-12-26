package Day6;
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



public class ReverseALL {
    private static Node reverseLL(Node head) {
        if (head == null || head.next == null)
            return head;

        // Node temp = head;
        // Stack<Integer> st = new Stack<>();

        // while (temp != null) {
        //     st.push(temp.data);
        //     temp = temp.next;
        // }

        // temp = head;

        // while (temp != null) {
        //     temp.data = st.peek();
        //     st.pop();
        //     temp = temp.next;
        // }

        // return head;





        // optimal approach...
        // Node temp = head;
        // Node prev = null;

        // while (temp != null) {
        //     Node front = temp.next;
        //     temp.next = prev;
        //     prev = temp;
        //     temp = front;
        // }

        // return prev;






        // recursive...
        Node newHead = reverseLL(head.next);

        Node front = head.next; 
        front.next = head;
        head.next = null;

        return newHead;
    }








    // print DLL...
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // main...
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

        head = reverseLL(head);
        printDLL(head);

        sc.close();
    }
}