package Day1;
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



    // ----------- Deletion -----------

    // head of LL...
    private static Node removesHead(Node head) {
        if (head == null) return head;

        head = head.next;
        return head;
    }


    // tail of LL...
    private static Node removesTail(Node head) {
        if ((head == null) || (head.next == null)) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }




    // position of LL...
    private static Node removesK(Node head, int k) {
        if (head == null) return head;

        if (k == 1) {
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            cnt++;

            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }



    // value of LL...
    private static Node removesEl(Node head, int el) {
        if (head == null) return head;

        if (head.data == el) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }





    // ---------- Insertion ----------

    // head of LL...
    private static Node insertHead(Node head, int val) {
        return new Node(val, head);
    }


    // tail of LL...
    private static Node insertTail(Node head, int val) {
        if (head == null) return new Node(val);

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node new_Node = new Node(val);
        temp.next = new_Node;
        return head;
    }




    // kth in LL...
    private static Node insertKth(Node head, int el, int k) {
        if (head == null) {
            if (k == 1) return new Node(el);
            else return null;
        }

        if (k == 1) return new Node(el, head);

        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;

            if (cnt == k - 1) {
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }



    // val in LL...
    private static Node insertBeforeVal(Node head, int el, int val) {
        if (head.data == val) return new Node(el, head);

        Node temp = head
        ;
        while (temp.next != null) {
            if (temp.next.data ==val) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }

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


        // ----------- Deletion -----------
        // head = removesHead(head);
        // head = removesTail(head);
        // head = removesK(head, 3);
        // head = removesEl(head, 3);
        // print(head);




        // ---------- Insertion ----------
        // head = insertHead(head, 100);
        // head = insertTail(head, 10);
        // head = insertKth(head, 100, 2);
        head = insertBeforeVal(head, 100, 4);
        print(head);




        sc.close();
    }
}
