package Day8;
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


public class MiddleofLL {
    private static Node middleOfLL(Node head) {
        // Node temp = head;
        // int cnt = 0;

        // while (temp != null) {
        //     cnt++;
        //     temp = temp.next;
        // }

        // int midNode = (cnt / 2) + 1;

        // temp = head;

        // while (temp != null) {
        //     midNode -= 1;
            
        //     if (midNode == 0) break;

        //     temp = temp.next;
        // }

        // return temp;




        // optimal approach...
        // tortorise and hare algorithm...
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }








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
            }
            prev = newNode;
        }

        Node mid = middleOfLL(head);
        System.out.println("Middle element: " + mid.data);

        sc.close();
    }
}
