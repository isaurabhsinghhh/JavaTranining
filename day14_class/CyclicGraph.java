package day14_class;

import java.util.ArrayList;
import java.util.Scanner;

public class CyclicGraph {

    static boolean hasCycle(
            int node,
            int parent,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited) {

        visited[node] = true;

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                if (hasCycle(neighbour, node, graph, visited)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int v = sc.nextInt();

        System.out.println("Enter number of edges:");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int vertex = sc.nextInt();

            graph.get(u).add(vertex);
            graph.get(vertex).add(u);
        }

        boolean[] visited = new boolean[v];
        boolean cycleFound = false;

        // Check every component, including disconnected ones.
        for (int i = 0; i < v; i++) {
            if (!visited[i] && hasCycle(i, -1, graph, visited)) {
                cycleFound = true;
                break;
            }
        }

        System.out.println(cycleFound ? "Cycle found" : "No cycle found");
        sc.close();
    }
}