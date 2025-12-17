package LinkedList.Day1;
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

public class IntroOfLL {
    private static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
            // mover = mover.next;
        }

        return head;
    }



    private static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            // System.out.print(temp.data + " ");
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }




    private static int checkIfPresent(Node head, int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }




    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }



    private static Node removesHead(Node head) {
        if (head == null) return head;

        head = head.next;
        return head;
    }




    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        // Node...
        // Node y = new Node(arr[3]);
        // System.out.print(y.data);

        Node head = convertArrToLL(arr);
        // System.out.print(head.data);

        // System.out.println(lengthOfLL(head));
        // System.out.print(checkIfPresent(head, 1));
        head = removesHead(head);
        print(head);




        sc.close();
    }
}
