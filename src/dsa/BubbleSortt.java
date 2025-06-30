package dsa;

public class BubbleSortt {

    //bubble out largest element at last by swapping and comparing each element with next element

    public static void main(String[] args) {
        int count=0;
        int[] arr={64, 34, 25, 12, 22, 11, 90, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("end");


        for (int i = 0; i < arr.length-1; i++) {
        boolean flag =false;
            for (int j = 0; j < arr.length-1-i; j++) {

                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag= true;
                    count++;


                }}
                if (!flag){
                    break;
                }


        }
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("count is "+count);
    }
}
