package Day12;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class PairsWithSum {

    public static Node findTail(Node head) {
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        return tail;
    }


    
    private static List<List<Integer>> pairWithSum(Node head, int target) {

        // brute approach...
        // List<List<Integer>> ans = new ArrayList<>();
        // Node temp1 = head;
        // if (head == null) return ans;

        // while (temp1 != null) {
        //     Node temp2 = temp1.next;

        //     while (temp2 != null && temp1.data + temp2.data <= target) {
        //         if (temp1.data + temp2.data == target) {
        //             ans.add(Arrays.asList(temp1.data, temp2.data));
        //         }
        //         temp2 = temp2.next;
        //     }
            
        //     temp1 = temp1.next;
        // }
        // return ans;






        // optimal approach...
        Node left = head;
        Node right = findTail(head);
        List<List<Integer>> ans = new ArrayList<>();

        if (head == null) return ans;

        while (left.data < right.data) {
            if (left.data + right.data == target) {
                ans.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            }
            else if (left.data + right.data < target) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }

        return ans;
    }








    // ----------- DRIVER CODE -----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null, tail = null;

        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node node = new Node(val);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }

        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        List<List<Integer>> result = pairWithSum(head, sum);

        if (result.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            System.out.println("Pairs with given sum:");
            for (List<Integer> pair : result) {
                System.out.println(pair.get(0) + " " + pair.get(1));
            }
        }

        sc.close();
    }
}