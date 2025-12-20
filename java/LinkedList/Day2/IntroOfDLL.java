package Day2;

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

public class IntroOfDLL {
    // convert arr to DLL...
    private static Node convertArrToDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }



    // ---------- Deletion ----------
    // delete head in DLL...
    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) return null;

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }



    // delete tail in DLL...
    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node tail = head;

        while (tail.next != null) tail = tail.next;

        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

        return head;
    }




    // delete kth ele in DLL...
    private static Node deleteKthElement(Node head, int k) {
        if (head == null) return null;

        int cnt = 0;

        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }

        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) return null;

        else if (prev == null) return deleteHead(head);
        else if (front == null) return deleteTail(head);

        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next = null;

        return head;
    }



    // delete the Node of the DLL...
    private static void deleteNode(Node temp) {
        Node prev = temp.back;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }

        prev.next = front;
        front.back = prev;

        temp.next = temp.back = null;
    }






    // ---------- Insertion (before) ----------
    // insert head in DLL...
    private static Node insertHead(Node head, int val) {
        if (head == null) return new Node(val);
        
        Node newHead = new Node(val, head, null);
        head.back = newHead;

        return newHead;
    }


    // insert tail in DLL...
    private static Node insertTail(Node head, int val) {
        if (head.next == null) return insertHead(head, val);

        Node tail = head;
        while (tail.next != null) tail = tail.next;

        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;

        return head;
    }


    // insert kth in DLL...
    private static Node insertKth(Node head, int k, int val) {
        if (k == 1) return insertHead(head, val);

        Node temp = head;
        int cnt = 0;
        
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }

        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }


    // insert node in DLL...
    private static void insertNode(Node node, int val) {
        Node prev = node.back;
        Node newNode = new Node(val, node, prev);
        prev.next = newNode;
        node.back = newNode;
    }






    // print Statement...
    private static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    private static void printReverse(Node head) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.back;
        }

        System.out.println();
    }








    // main function...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }





        // convert arr to DLL...
        Node head = convertArrToDLL(arr);



        // ---------- Deletion -----------
        // head = deleteHead(head);
        // head = deleteTail(head);
        // head = deleteKthElement(head, 3);
        // deleteNode(head.next);




        // ---------- Insertion -----------
        // head = insertHead(head, 10);
        // head = insertTail(head, 10);
        // head = insertKth(head, 3, 10);
        insertNode(head.next.next, 100);






        // print statement...
        printDLL(head);
        printReverse(head);



        sc.close();
    }
}