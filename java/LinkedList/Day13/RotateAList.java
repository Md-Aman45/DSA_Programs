package Day13;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}


public class RotateAList {
    private static Node findNthNode(Node temp, int k) {
        int cnt = 1;
        while (temp != null) {
            if (cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }




    private static Node rotateAList(Node head, int k) {
        if (head == null || k == 0) return head;
        
        Node tail = head;
        int len = 1;

        while (tail.next != null) {
            len++;
            tail = tail.next;
        }
        if (k % len == 0) return head;
        k = k % len;
        tail.next = head;

        Node newLastNode = findNthNode(head, (len - k));
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }






    // -------- PRINT METHOD --------
    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // -------- MAIN --------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node node = new Node(val);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        head = rotateAList(head, k);

        System.out.print("Rotated List: ");
        printList(head);

        sc.close();

        
    }
}