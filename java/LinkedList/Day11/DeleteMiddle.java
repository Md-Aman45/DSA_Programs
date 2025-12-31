package Day11;
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

public class DeleteMiddle {
    private static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) return null;

        // brute approach...
        // Node temp = head;
        // int n = 0;

        // while (temp != null) {
        //     n++;
        //     temp = temp.next;
        // }

        // int res = n / 2;
        // temp = head;

        // while (temp != null) {
        //     res--;
        //     if (res == 0) {
        //         temp.next = temp.next.next;
        //         break;
        //     }
        //     temp = temp.next;
        // }

        // return head;





        // optimal approach...
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }








    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = deleteMiddle(head);

        System.out.print("List after deleting middle: ");
        printList(head);

        sc.close();
    }
}
