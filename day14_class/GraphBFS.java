package day14_class;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBFS {

    static void BFS(
            int start,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);

            for (int neighbour : graph.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
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
        System.out.println("BFS:");
        BFS(start, graph, visited);

        sc.close();
    }
}