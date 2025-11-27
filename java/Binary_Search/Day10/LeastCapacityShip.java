package Day10;
import java.util.*;

public class LeastCapacityShip {
    public int shippingOfDays(int[] weight, int cap) {
        int days = 1;
        int load = 0;

        for (int i = 0; i < weight.length; i++) {
            if (load + weight[i] > cap) {
                days++;
                load = weight[i];
            }
            else {
                load += weight[i];
            }
        }

        return days;
    }



    // helper function to calculate total sum...
    public int sumOfTotal(int[] weight) {
        int total = 0;
        for (int num : weight) total += num;

        return total;
    }


    public int leastCapacityDays(int[] weight, int days) {
        int n = weight.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, weight[i]);
        }

        int low = maxi;
        int high = sumOfTotal(weight);

        while (low <= high) {
            int mid = (low + high) / 2;
            
            int noOfDays = shippingOfDays(weight, mid);

            if (noOfDays <= days) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        System.out.print("Enter the weights: ");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.print("Enter days: ");
        int days = sc.nextInt();

        LeastCapacityShip obj = new LeastCapacityShip();
        int ans = obj.leastCapacityDays(weight, days);
        System.out.println("Minimum ship capacity needed = " + ans + " " + "days.");


        sc.close();
    }
}