package Day5;
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

public class SortZeroOneTwo {
    private static Node sortZeroOneTwo(Node head) {
        if (head == null || head.next == null) return head;


        Node temp = head;
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        while (temp != null) {
            if (temp.data == 0) cnt0++;
            else if (temp.data == 1) cnt1++;
            else cnt2++;

            temp = temp.next;
        }


        temp = head;

        while (temp != null) {
            if (cnt0 > 0) {
                temp.data = 0;
                cnt0--;
            }
            else if (cnt1 > 0) {
                temp.data = 1;
                cnt1--;
            }
            else {
                temp.data = 2;
                cnt2--;
            }

            temp = temp.next;
        }

        return head;
    }



    // Print linked list...
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // Create list...
    private static Node createList(Scanner sc) {
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) return null;

        System.out.print("Enter node values (0, 1, 2): ");
        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = createList(sc);

        System.out.println("\nOriginal Linked List:");
        printList(head);

        head = sortZeroOneTwo(head);

        System.out.println("\nSorted Linked List:");
        printList(head);

        sc.close();
    }
}