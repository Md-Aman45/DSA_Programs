package Day16;
import java.util.*;

class BrowserNode {
    String data;
    BrowserNode next;
    BrowserNode back;

    BrowserNode(String data1, BrowserNode next1, BrowserNode back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    BrowserNode(String data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

class Browser {
    private BrowserNode currPage;

    // Constructor...
    Browser(String homePage) {
        currPage= new BrowserNode(homePage);
    }


    // visit a new page...
    public void visit(String url) {
        // Clear forward history...
        currPage.next = null;

        BrowserNode newNode = new BrowserNode(url);
        currPage.next = newNode;
        newNode.back = currPage;
        currPage = newNode;
    }


    // Move back...
    public String back(int steps) {
        while (steps > 0 && currPage.back != null) {
            currPage = currPage.back;
            steps--;
        }
        return currPage.data;
    }


    // Move forward...
    public String forward(int steps) {
        while (steps > 0 && currPage.next != null) {
            currPage = currPage.next;
            steps--;
        }
        return currPage.data;
    }

}




public class DesignABrowser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter home page: ");
        String home = sc.next();

        Browser browser = new Browser(home);

        while (true) {
            System.out.println("\n1. Visit");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter URL: ");
                String url = sc.next();
                browser.visit(url);
                System.out.println("Current Page: " + url);
            }
            else if (choice == 2) {
                System.out.print("Steps to go back: ");
                int steps = sc.nextInt();
                System.out.println("Current Page: " + browser.back(steps));
            }
            else if (choice == 3) {
                System.out.print("Steps to go forward: ");
                int steps = sc.nextInt();
                System.out.println("Current Page: " + browser.forward(steps));
            }
            else {
                break;
            }
        }

        sc.close();
    }
}
