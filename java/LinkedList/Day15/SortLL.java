package Day15;
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


public class SortLL {

    public static Node findMiddle(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static Node mergeTwoList(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node t1 = head1;
        Node t2 = head2;

        Node dNode = new Node(-1);
        Node temp = dNode;

        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        if (t1 != null)
            temp.next = t1;
        else
            temp.next = t2;

        return dNode.next;
    }


    private static Node sortLL(Node head) {
        if (head == null || head.next == null) return head;

/*
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(arr);

        int i = 0;
        temp = head;

        while (temp != null) {
            temp.data = arr.get(i);
            i = i + 1;
            temp = temp.next;
        }

        return head;
*/




        // optimal approach...
        Node middle = findMiddle(head);
        Node leftHead = head;
        Node rightHead = middle.next;
        middle.next = null;

        leftHead = sortLL(leftHead);
        rightHead = sortLL(rightHead);

        return mergeTwoList(leftHead, rightHead);
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
            Node node = new Node(val);

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        head = sortLL(head);

        System.out.print("Sorted Linked List: ");
        printList(head);

        sc.close();
    }
}