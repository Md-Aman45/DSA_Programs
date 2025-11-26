package Day9;
import java.util.*;

public class KokoEating {

    // Function to find max element in array...
    public int findMax(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        return maxi;
    }   

    // Function to calculate total hours needed at speed k...
    public int calculateHours(int[] piles, int k) {
        int hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k;     // same as ceil(pile / k)...
        }

        return hours;
    }



    // Main function to find minimum eating speed...
    public int minEatingSpeed(int[] piles, int h, int n) {
        int low = 1, high = findMax(piles, n);

        while (low <= high) {
            int mid = (low + high) / 2;

            int totalhrs = calculateHours(piles, mid);

            if (totalhrs <= h) {
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

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];
        System.out.print("Enter pile sizes: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter total hours H: ");
        int h = sc.nextInt();

        KokoEating k = new KokoEating();
        int ans = k.minEatingSpeed(piles, h, n);

        System.out.println("Minimum eating speed: " + ans + " bananas/hour");


        sc.close();
    }
}