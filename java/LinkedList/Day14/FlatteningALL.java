package Day14;
import java.util.*;

class FlatNode {
    int data;
    FlatNode next;
    FlatNode child;

    FlatNode(int data1, FlatNode next1, FlatNode child1) {
        this.data = data1;
        this.next = next1;
        this.child = child1;
    }

    FlatNode(int data1) {
        this.data = data1;
        this.next = null;
        this.child = null;
    }
}

public class FlatteningALL {


/* 
    public static FlatNode convertToLL(ArrayList<Integer> arr) {
        if (arr.size() == 0) return null;

        FlatNode head = new FlatNode(arr.get(0));
        FlatNode temp = head;

        for (int i = 1; i < arr.size(); i++) {
            FlatNode newNode = new FlatNode(arr.get(i));
            temp.child = newNode;
            temp = temp.child;
        }
        return head;
    }
*/





    public static FlatNode mergeTwoLL(FlatNode list1, FlatNode list2) {
        FlatNode dNode = new FlatNode(-1);
        FlatNode res = dNode;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                res.child = list1;
                list1 = list1.child;
            }
            else {
                res.child = list2;
                list2 = list2.child;
            }

            res = res.child;
            res.next = null;
        }

        if (list1 != null) res.child = list1;
        else res.child = list2;

        return dNode.child;
    }




    private static FlatNode flattenLL(FlatNode head) {
    
    /*
        ArrayList<Integer> arr = new ArrayList<>();
        FlatNode temp = head;

        while (temp != null) {
            FlatNode t2 = temp;

            while (t2 != null) {
                arr.add(t2.data);
                t2 = t2.child;
            }
            temp = temp.next;
        }

        Collections.sort(arr);

        head = convertToLL(arr);

        return head;
    */


        


        // optimal approach...
        if (head == null || head.next == null) return head;

        FlatNode mergedHead = flattenLL(head.next);

        return mergeTwoLL(head, mergedHead);
    }








    // Print flattened list (using child pointer)
    private static void printList(FlatNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of horizontal lists: ");
        int n = sc.nextInt();

        FlatNode head = null, prev = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of nodes in list " + (i + 1) + ": ");
            int m = sc.nextInt();

            System.out.print("Enter elements: ");
            FlatNode verticalHead = null, verticalTail = null;

            for (int j = 0; j < m; j++) {
                int val = sc.nextInt();
                FlatNode node = new FlatNode(val);

                if (verticalHead == null) {
                    verticalHead = verticalTail = node;
                } else {
                    verticalTail.child = node;
                    verticalTail = node;
                }
            }

            if (head == null) {
                head = verticalHead;
            } else {
                prev.next = verticalHead;
            }
            prev = verticalHead;
        }

        FlatNode flattened = flattenLL(head);

        System.out.print("Flattened List: ");
        printList(flattened);


        sc.close();
    }
}
