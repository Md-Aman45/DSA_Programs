package Day4;
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


public class OddEvenLL {

    // Odd & Even Linked List...
    private static Node oddEvenLL(Node head) {
        if (head == null || head.next == null) {
            System.out.println("List is too short. No changes needed.");
            return head;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        System.out.println("\nCollecting odd indexed nodes:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            arr.add(temp.data);

            if (temp.next == null) break;
            temp = temp.next.next;
        }
        System.out.println();


        temp = head.next;

        System.out.println("Collecting even indexed nodes:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            arr.add(temp.data);

            if (temp.next == null) break;
            temp = temp.next.next;
        }
        System.out.println();

        System.out.println("ArrayList after collecting:");
        System.out.println(arr);

        temp = head;
        int i = 0;
        System.out.println("\nRewriting linked list:");

        while (temp != null) {
            System.out.println(
                "Replacing node value " + temp.data + " with " + arr.get(i)
            );
            temp.data = arr.get(i);
            i++;
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


    // Create linked list using Scanner
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

        head = oddEvenLL(head);

        System.out.println("\nAfter Odd-Even Arrangement:");
        printList(head);

        sc.close();
    }
}