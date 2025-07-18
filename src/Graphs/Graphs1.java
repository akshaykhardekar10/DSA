package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs1 {

    static int n = 9;
    static ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> adjList() {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n+ 1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);
        adj.get(1).add(6);

        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(2).add(1);

        adj.get(6).add(7);
        adj.get(6).add(8);
        adj.get(6).add(1);

        adj.get(3).add(2);

        adj.get(4).add(2);
        adj.get(4).add(5);

        adj.get(7).add(6);
        adj.get(7).add(8);

        adj.get(9).add(6);
        adj.get(5).add(4);
        adj.get(8).add(7);


        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
        adj1 = adj;
        return adj;
    }

    public static ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visited[1] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (Integer i : adj.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }

    public static ArrayList<Integer> bfsRandomNode(int n, ArrayList<ArrayList<Integer>> adj, int start) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (Integer i : adj.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }

    public static ArrayList<ArrayList<Integer>> adjList2() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }

        // Component 1
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Component 2
        adj.get(4).add(5);
        adj.get(5).add(4);

        // Component 3
        adj.get(6).add(7);
        adj.get(7).add(6);
        adj.get(7).add(8);
        adj.get(8).add(7);

        // Node 9 is isolated (adj.get(9) stays empty)

        // Optional: Print the adjacency list for visual check
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        return adj;
    }

    public static ArrayList<Integer> bfsDisconnected(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> fullBfs = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    int node = q.poll();
                    fullBfs.add(node);

                    for (Integer neighbor : adj.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            q.add(neighbor);
                        }
                    }
                }
            }
        }
        return fullBfs;
    }


    public static void main(String[] args) {
        adjList();
        System.out.println("this is a bfs");
        System.out.println(bfs(n, adj1));
        System.out.println(bfsRandomNode(n, adj1, 6));

        ArrayList<ArrayList<Integer>> adj2 = adjList2();

        System.out.println("Disconnected BFS test:");
        System.out.println(bfsDisconnected(n, adj2));

    }
}