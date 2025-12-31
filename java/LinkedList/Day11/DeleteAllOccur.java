package Day11;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class DeleteAllOccur {
    private static Node deleteAllOccur(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                if (temp == head) {
                    head = head.next;
                }

                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if (nextNode != null) nextNode.prev = prevNode;
                if (prevNode != null) prevNode.next = nextNode;
                temp = nextNode;
            }
            else {
                temp = temp.next;
            }
        }

        return head;
    }











    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node node = new Node(val);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();

        head = deleteAllOccur(head, key);

        System.out.print("List after deletion: ");
        printList(head);

        sc.close();
    }
}