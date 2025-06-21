package Arrayss_2D;

//pascals triangle
// sum = arr[i-1][j] + arr[i-1][j-1]
//jagged array arr[i][] = arr[i][i+1]
// first and last for each row and c=1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static int[][] PascalsT(int n) {
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;

            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }

return arr;
    }

    public static List<List<Integer>> pascalsByList (int n ){
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer>prevRow = ans.get(i-1);

            List<Integer> middleRows = new ArrayList<>();
            middleRows.add(1); //for the first element

            for (int j = 1; j < i; j++) {
                middleRows.add(prevRow.get(j)+prevRow.get(j-1));
            }


            middleRows.add(1); ////for the last element
            ans.add(middleRows);
        }
        return ans;
    }

    public static void main(String[] args) {

        //int [][] ans= PascalsT(6);
//        printMatrix(ans);
        pascalsByList(5);
//        printMatrix(ans);

    }

}