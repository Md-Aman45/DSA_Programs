package Day10;
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


public class LengthOfLoop {
    private static Integer lengthOfLoop(Node head) {
        // brute approach...
        HashMap<Node, Integer> mpp = new HashMap<>();
        Node temp = head;
        int timer = 1;

        while (temp != null) {
            if (mpp.containsKey(temp)) {
                int value = mpp.get(temp);
                return (timer - value);
            }
            mpp.put(temp, timer);
            timer++;
            temp = temp.next;
        }

        return 0;
    }



    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.print("Enter node values: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Create loop
        System.out.print("Enter position to create loop (0 for no loop): ");
        int pos = sc.nextInt();

        if (pos > 0) {
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            tail.next = temp;
        }

        int result = lengthOfLoop(head);

        if (result == 0)
            System.out.println("No loop detected");
        else
            System.out.println("Length of loop: " + result);

        sc.close();
    }
}
