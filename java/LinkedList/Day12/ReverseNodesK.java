package Day12;
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


public class ReverseNodesK {

    private static Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }


    private static Node findKthNode(Node temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    private static Node reverseNodesK(Node head, int k) {
        Node temp = head;
        Node prevNode = null;

        while (temp != null) {
            Node kthNode = findKthNode(temp, k);

            if (kthNode == null) {
                if (prevNode != null) prevNode.next = temp;
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;

            reverseLL(temp);

            if (temp == head) {
                head = kthNode;
            }
            else {
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }





    // Print linked list...
    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // MAIN METHOD...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        head = reverseNodesK(head, k);

        System.out.print("Result: ");
        printList(head);

        
        sc.close();
    }
}
