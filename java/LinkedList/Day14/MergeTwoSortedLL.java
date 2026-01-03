package Day14;
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


public class MergeTwoSortedLL {

    private static Node convertarrToLL(ArrayList<Integer> arr) {
        if (arr.size() == 0) return null;

        Node head = new Node(arr.get(0));
        Node temp = head;

        for (int i = 1; i < arr.size(); i++) {
            temp.next = new Node(arr.get(i));
            temp = temp.next;
        }
        return head;
    }


    private static Node mergeTwoSortedL(Node head1, Node head2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            arr.add(temp1.data);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            arr.add(temp2.data);
            temp2 = temp2.next;
        }

        Collections.sort(arr);

        Node head = convertarrToLL(arr);

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

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First list
        System.out.print("Enter number of nodes in first list: ");
        int n1 = sc.nextInt();

        System.out.print("Enter elements of first sorted list: ");
        Node head1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            Node node = new Node(val);
            if (head1 == null) {
                head1 = tail1 = node;
            } else {
                tail1.next = node;
                tail1 = node;
            }
        }

        // Second list
        System.out.print("Enter number of nodes in second list: ");
        int n2 = sc.nextInt();

        System.out.print("Enter elements of second sorted list: ");
        Node head2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            Node node = new Node(val);
            if (head2 == null) {
                head2 = tail2 = node;
            } else {
                tail2.next = node;
                tail2 = node;
            }
        }

        // Merge
        Node mergedHead = mergeTwoSortedL(head1, head2);

        // Output
        System.out.print("Merged Sorted List: ");
        printList(mergedHead);
    }
}