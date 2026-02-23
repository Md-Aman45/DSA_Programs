package recursions_backtrackings.Day13;
import java.util.*;

public class M_Coloring {
    private static boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col) {
        for (int it : G[node]) {
            if (color[it] == col)
                return false;
        }
        return true;
    }

    private static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
        if (node == n)
            return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, G, color, n, i)) {
                color[node] = i;

                if (solve(node + 1, G, color, n, m) == true)
                    return true;

                color[node] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();


        List<Integer>[] G = new ArrayList[n];
        for (int i = 0; i < n; i++)
            G[i] = new ArrayList<>();
        
        
        System.out.println("Enter edges (u v): ");

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;

            G[u].add(v);
            G[v].add(u);
        }


        System.out.print("Enter number of color (m): ");
        int m = sc.nextInt();

        int[] color = new int[n];

        if (solve(0, G, color, n, m)) {
            System.out.println("Coloring possible!");
            System.out.println("Assigned Colors: ");

            for(int i = 0; i < n; i++) 
                System.out.println("Vertex " + i + " -> Color " + color[i]);
        }
        else {
            System.out.print("Coloring NOT possible!");
        }

    }
}