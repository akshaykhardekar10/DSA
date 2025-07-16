package Graphs;

import java.util.ArrayList;

public class DFS {

    static int n=9;
    static ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();

    public static void dfs(int node , ArrayList<ArrayList<Integer>> adj ,boolean[] vis,  ArrayList<Integer>ans){

        vis[node]=true;
        ans.add(node);

        for (Integer i : adj.get(node)){
            if (vis[i]==false){
                dfs(i,adj,vis,ans);
            }
        }
    }

    public static ArrayList<Integer> dfsAns (int n , ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[n+1];
        ArrayList<Integer> ans =new ArrayList<>();
        dfs(1,adj1,vis,ans);
        return ans ;
    }

    public static void main(String[] args) {
         adj1=adjList();
        ArrayList<Integer>ans =dfsAns(n,adj1);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> adjList(){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
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
                System.out.print(adj.get(i).get(j) +" ");
            }
            System.out.println();
        }
        return adj;
    }
}