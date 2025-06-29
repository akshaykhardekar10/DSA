package dsa;

public class SelectionSort {
    public static void main(String[] args) {
        int count=0,i,j,k;
        int arr[] = {2, 7, 1, 13, 46, 1,5, 236, 23377};
        for ( i = 0; i < arr.length - 1; i++) {

          int   min_val=i;
            for (j = i+1; j < arr.length ; j++) {
               if(arr[j]<arr[min_val]){
                  min_val=j;

            }}
               int temp=arr[min_val];
               arr[min_val]=arr[i];
               arr[i]=temp;
            count++;

        }
        for (int l = 0; l <arr.length ; l++) {
            System.out.println(arr[l]);
        }
        System.out.println("count is "+ count);

    }
}
