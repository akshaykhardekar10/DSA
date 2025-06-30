package dsa;

public class Sorts {
    //inserting each element in correct position iteratively
    //start from index 1
    //j=i;
    //compare a[j]&& a[j-1] when j > 0n
    //swap
    //decrement j
    // time complexity  :  best O(n) , worst O(n^2) , avg O(n^2)
    //space constant
    //stable ? : yes
    //applications : some part is already sorted  , small array ;
    static void insertionSort(int[] arr ){
        for (int i = 1; i < arr.length; i++) {
            int j =i;
            while (j>0 &&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr= {1,8,3,3,5,66,44,33,2,5,7};
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        insertionSort(arr);

        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
