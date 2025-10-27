package Day14;
import java.util.*;

public class BuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " " + "numbers: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Best Time to buy & sell stock...
        // int mini = arr[0];
        // int profit = 0;

        // for (int i = 1; i < n; i++) {
        //     int cost = arr[i] - mini;
        //     profit = Math.max(profit, cost);

        //     mini = Math.min(mini, arr[i]);
        // }

        // System.out.println("The maximum profit you can achieve is: " + profit);




        
        
        // // next version...
        int mini = arr[0];
        int profit = 0;
        int buyPrice = arr[0], sellPrice = arr[0];

        for (int i = 0; i < n; i++) {
            int cost = arr[i] - mini;

            if (cost > profit) {
                profit = cost;
                buyPrice = mini;
                sellPrice = arr[i];
            }

            mini = Math.min(mini, arr[i]);
        }

        System.out.println("Buy at: " + buyPrice);
        System.out.println("Sell at: " + sellPrice);
        System.out.println("Maximum Profit you can achieve is: " + profit);




        sc.close();
    }
}
