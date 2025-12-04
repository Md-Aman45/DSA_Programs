package Day14;
import java.util.*;

public class GasStation {
    public double minimizeMaxDistance(int[] arr, int k) {
        int n = arr.length;

        if (n < 2) return 0.0;



        class Segment {
            double baseLen;
            int stations;

            Segment(double baseLen) {
                this.baseLen = baseLen;
                this.stations = 0;
            }

            double currentMaxSegmentLength() {
                return baseLen / (stations + 1);
            }
        }


        PriorityQueue<Segment> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.currentMaxSegmentLength(), a.currentMaxSegmentLength())
        );


        for (int i = 0; i < n - 1; i++) {
            double diff = arr[i + 1] - arr[i];
            pq.offer(new Segment(diff));
        }

        for (int gasStation = 0; gasStation < k; gasStation++) {
            Segment seg = pq.poll();
            seg.stations++;
            pq.offer(seg);
        }

        return pq.peek().currentMaxSegmentLength();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of gas stations: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " positions: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter k (new stations to add): ");
        int k = sc.nextInt();


        GasStation gs = new GasStation();
        double ans = gs.minimizeMaxDistance(arr, k);

        System.out.println("Minimum possible maximum distance = " + ans);

        sc.close();
    }
}