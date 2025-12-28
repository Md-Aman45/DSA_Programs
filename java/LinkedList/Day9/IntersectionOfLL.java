package Day9;
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



public class IntersectionOfLL {
    private static Node intersectionLL(Node head1, Node head2) {

        // brute approach...
        HashSet<Node> set = new HashSet<>();
        Node temp = head1;

        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = head2;

        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }

        return null;

    }





    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- INPUT FIRST LIST --------
        System.out.print("Enter number of nodes in list 1: ");
        int n1 = sc.nextInt();

        Node head1 = null, tail1 = null;

        System.out.print("Enter elements of list 1: ");
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // -------- INPUT SECOND LIST --------
        System.out.print("Enter number of nodes in list 2: ");
        int n2 = sc.nextInt();

        Node head2 = null, tail2 = null;

        System.out.print("Enter elements of list 2: ");
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        // -------- CONNECT INTERSECTION --------
        System.out.print("Enter position to intersect (1-based, 0 for no intersection): ");
        int pos = sc.nextInt();

        if (pos > 0) {
            Node temp = head1;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            tail2.next = temp;  // create intersection
        }

        // -------- FIND INTERSECTION --------
        Node result = intersectionLL(head1, head2);

        if (result != null)
            System.out.println("Intersection Node Value: " + result.data);
        else
            System.out.println("No intersection found");

        sc.close();
    }
}