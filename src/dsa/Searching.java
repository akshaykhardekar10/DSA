package dsa;

public class Searching {

    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12,13,14,15,16,17,18,19,20};
//        int result = linear_search(arr, 6555);
//        if (result == -1) {
//            System.out.println("key not found in the  array ");
//        }

        Binary_search(arr,1);
    }

    public static int linear_search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("found the key at index : " + i);
                return i;
            }
        }
        return -1;

    }


    public static int  Binary_search(int []arr ,int key ){
        int low,high,mid;
        low=0;
        high=arr.length-1;

        while (low<=high) {
            mid=(low+high)/2;
            if (arr[mid] == key ) {
                System.out.println("found the key at index : " + mid);
                return mid;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else if (arr[mid] > key){
                high=mid-1;
            }
        }
        return -1;
    }
}
