package day14_class;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphDFS {

    static void DFS(
            int start,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited) {

        visited[start] = true;
        System.out.println(start);

        for (int neighbour : graph.get(start)) {
            if (!visited[neighbour]) {
                DFS(neighbour, graph, visited);
            }
        }
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

        System.out.println("Enter starting vertex:");
        int start = sc.nextInt();

        boolean[] visited = new boolean[v];
        System.out.println("DFS:");
        DFS(start, graph, visited);

        sc.close();
    }
}