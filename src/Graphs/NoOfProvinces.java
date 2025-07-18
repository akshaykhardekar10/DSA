package Graphs;

public class NoOfProvinces {

    public static void dfs(int i , int[][] isConnected , boolean[] vis){
        vis[i]=true;
        for (int j = 0; j < isConnected.length ; j++) {
            if (!vis[j] && isConnected[i][j]==1){
                dfs(j,isConnected,vis);
            }
        }
    }

    public static void main(String[] args) {
        int [][] isConnected ={
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        int n =isConnected.length;
        boolean []vis =new boolean[n];
        int count =0 ;
        System.out.println(isConnected.length);


        for (int i = 0; i < n; i++) {
            if (!vis[i]){
                dfs(i,isConnected,vis);
                count++;
            }
        }
        System.out.println(count);
    }
}