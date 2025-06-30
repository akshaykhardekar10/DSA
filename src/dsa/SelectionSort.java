package dsa;

public class SelectionSort {
    //searching minimum element and swapping it with current index I
    //  time complexity  O(n^2) in every case
    // Stable ? : not stable
    // in place: yes

    static void selectionSort(int[] arr){
        int count = 0, i, j;
        for (i = 0; i < arr.length - 1; i++) {
            int min_val = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_val]) {
                    min_val = j;
                }
            }
            int temp = arr[min_val];
            arr[min_val] = arr[i];
            arr[i] = temp;
            count++;
        }
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }
        System.out.println("count is " + count);
    }

    static void selectionSortOnStrings(String [] strArr){
        for (int i = 0; i < strArr.length-1; i++) {
            int minval = i;
            for (int j = i+1; j < strArr.length; j++) {
                if (strArr[j].compareTo(strArr[minval])<0){
                    minval=j;
                }
            }
            String temp = strArr[i];
            strArr[i]= strArr[minval];
            strArr[minval]=temp;

        }
    }


    public static void main(String[] args) {

        int arr[] = {2, 7, 1, 13, 46, 1, 5, 236, 23377};
        // selectionSort(arr);

        String[] strArr={"apple","kiwi","banana","xyz"};
        for (String val : strArr){
            System.out.print(val +" ");
        }
        System.out.println();

        selectionSortOnStrings(strArr);
        for (String val : strArr){
            System.out.print(val + " ");
        }
    }
}
