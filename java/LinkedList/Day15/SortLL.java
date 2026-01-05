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
    private static Node sortLL(Node head) {
        if (head == null || head.next == null) return head;

        
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