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

public class RemoveNodeFromEnd {
    private static Node removenthNodeFromEnd(Node head, int N) {
        if (head == null) return null;


        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == N) return head.next;

        int res = cnt - N;
        temp = head;

        while (res > 1) {
            temp = temp.next;
            res--;
        }

        temp.next = temp.next.next;

        return head;
    }


    // Print linked list
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Create linked list
    private static Node createList(Scanner sc) {
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) return null;

        System.out.print("Enter node values: ");
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

        System.out.print("\nEnter N (from end): ");
        int N = sc.nextInt();

        head = removenthNodeFromEnd(head, N);

        System.out.println("\nLinked List after deletion:");
        printList(head);

        sc.close();
    }
}