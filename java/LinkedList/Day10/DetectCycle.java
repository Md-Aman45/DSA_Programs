package Day10;
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


public class DetectCycle {
    // Brute Approach...
    private static Boolean detectCycle(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while (temp != null) {
            if (set.contains(temp)) {
                return true;
            }

            set.add(temp);
            temp = temp.next;
        }

        return false;
    }









    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.print("Enter node values: ");
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

        // Creating a cycle (optional)
        System.out.print("Enter position to create cycle (1-based, 0 for no cycle): ");
        int pos = sc.nextInt();

        if (pos > 0) {
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            tail.next = temp;
        }

        // Check for cycle
        boolean result = detectCycle(head);

        if (result)
            System.out.println("Cycle detected in linked list.");
        else
            System.out.println("No cycle found in linked list.");

        sc.close();
    }
}
