package Day11;
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


public class StartingOfLoop {
    private static Node startingPointOfLoop(Node head) {
        // brute approach...
        // HashSet<Node> set = new HashSet<>();
        // Node temp = head;
        
        // while (temp != null) {
        //     if (set.contains(temp)) return temp;

        //     set.add(temp);
        //     temp = temp.next;
        // }
        // return null;




        // optimal approach...
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }







    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("List is empty");
            return;
        }

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

        System.out.print("Enter position to create loop (0-based index, -1 for no loop): ");
        int pos = sc.nextInt();

        if (pos != -1) {
            Node temp = head;
            Node loopNode = null;
            int index = 0;

            while (temp != null) {
                if (index == pos) {
                    loopNode = temp;
                }
                if (temp.next == null) {
                    temp.next = loopNode;
                    break;
                }
                temp = temp.next;
                index++;
            }
        }

        Node result = startingPointOfLoop(head);

        if (result != null) {
            System.out.println("Loop starts at node with value: " + result.data);
        } else {
            System.out.println("No loop detected.");
        }

        sc.close();
    }
}
