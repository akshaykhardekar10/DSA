package Graphs;

import java.util.ArrayList;


public class CycleInUndirected {

    public boolean isCycle(){
        return true;
    }
    public static void main(String[] args) {
        int no =9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < no + 1; i++) {
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
    }
}