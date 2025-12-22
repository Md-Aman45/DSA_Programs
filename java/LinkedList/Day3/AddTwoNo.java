package Day3;
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


public class AddTwoNo {
    // Function to add two numbers...
    private static Node addTwoNum(Node num1, Node num2) {
        Node temp1 = num1;
        Node temp2 = num2;

        Node dummyNode = new Node(-1);
        Node curr = dummyNode;

        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;

            if (temp1 != null) sum = sum + temp1.data;
            if (temp2 != null) sum = sum + temp2.data;

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }


        if (carry > 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        return dummyNode.next;
    }



    // Print linked list...
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }



    // Main method...
    public static void main(String[] args) {
         // First number: 442 (stored as 2 -> 4 -> 3)
        Node num1 = new Node(2);
        num1.next = new Node(4);
        num1.next.next = new Node(4);

        // Second number: 465 (stored as 5 -> 6 -> 4)
        Node num2 = new Node(5);
        num2.next = new Node(6);
        num2.next.next = new Node(4);

        System.out.print("Number 1: ");
        printList(num1);

        System.out.print("Number 2: ");
        printList(num2);

        Node result = addTwoNum(num1, num2);

        System.out.print("Sum: ");
        printList(result);
    }
}