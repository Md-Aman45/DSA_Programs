package Day16;
import java.util.*;

class Node {
    int data;
    Node next;
    Node random;

    Node(int data1, Node next1, Node random1) {
        this.data = data1;
        this.next = next1;
        this.random = random1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.random = null;
    }
}


public class CloneALL {
    private static Node cloneALL(Node head) {
        if (head == null) return null;

        Node temp = head;
        HashMap<Node, Node> mpp = new HashMap<>();

        while (temp != null) {
            Node newNode = new Node(temp.data);
            mpp.put(temp, newNode);
            temp = temp.next;
        }


        temp = head;

        while (temp != null) {
            Node copyNode = mpp.get(temp);
            copyNode.next = mpp.get(temp.next);
            copyNode.random = mpp.get(temp.random);
            temp = temp.next;
        }

        return mpp.get(head);
    }





    // Print linked list (data + random)...
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.data : -1;
            System.out.println(
                "Node data: " + temp.data + 
                ", Random points to: " + randomVal
            );
            temp = temp.next;
        }
    }

    // MAIN METHOD...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node[] nodes = new Node[n];

        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.nextInt());
        }

        // Link next pointers...
        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        System.out.println(
            "Enter random pointer index for each node (-1 for null):"
        );
        for (int i = 0; i < n; i++) {
            int idx = sc.nextInt();
            if (idx != -1) {
                nodes[i].random = nodes[idx];
            }
        }

        Node head = nodes[0];

        Node clonedHead = cloneALL(head);

        System.out.println("\nOriginal List:");
        printList(head);

        System.out.println("\nCloned List:");
        printList(clonedHead);

        sc.close();
    }
}