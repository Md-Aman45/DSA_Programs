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

public class MergeKSortedLL {

    private static Node convertArrToLL(ArrayList<Integer> arr) {
        if (arr.size() == 0) return null;

        Node head = new Node(arr.get(0));
        Node temp = head;

        for (int i = 1; i < arr.size(); i++) {
            temp.next = new Node(arr.get(i));
            temp = temp.next;
        }
        return head;
    }



    private static Node mergeKSorted(ArrayList<Node> lists) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (Node head : lists) {
            Node temp = head;
            while (temp != null) {
                arr.add(temp.data);
                temp = temp.next;
            }
        }

        Collections.sort(arr);

        Node head = convertArrToLL(arr);
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


    // Main...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of linked lists (K): ");
        int k = sc.nextInt();

        ArrayList<Node> lists = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            System.out.print("Enter number of nodes in list " + (i + 1) + ": ");
            int n = sc.nextInt();

            System.out.print("Enter elements (sorted): ");
            Node head = null, tail = null;

            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                Node node = new Node(val);

                if (head == null) {
                    head = tail = node;
                }
                else {
                    tail.next = node;
                    tail = node;
                }
            }
            lists.add(head);
        }

        Node mergedHead = mergeKSorted(lists);

        System.out.print("Merged Sorted List: ");
        printList(mergedHead);
    }
}
