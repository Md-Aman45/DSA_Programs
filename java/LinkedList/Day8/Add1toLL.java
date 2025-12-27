package Day8;

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

public class Add1toLL {
    private static Node reverseLL(Node head) {
        if (head == null || head.next == null)
            return head;
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

    private static Node add1toLL(Node head) {
        head = reverseLL(head);
        Node temp = head;
        int carry = 1;

        while (temp != null) {
            temp.data = temp.data + carry;

            if (temp.data < 10) {
                carry = 0;
                break;
            } else {
                temp.data = 0;
                carry = 1;
            }

            temp = temp.next;
        }

        if (carry == 1) {
            Node newNode = new Node(1);
            head = reverseLL(head);
            newNode.next = head;
            return newNode;
        }

        head = reverseLL(head);
        return head;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, prev = null;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
            } else {
                prev.next = newNode;
                newNode.back = prev;
            }
            prev = newNode;
        }

        head = add1toLL(head);

        System.out.print("Result: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }

}