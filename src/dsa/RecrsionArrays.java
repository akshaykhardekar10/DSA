package dsa;
public class RecrsionArrays{

    public static void printArrayRecursive(int []arr , int index){
        if (index==arr.length){
            return;
        }
        System.out.print(arr[index] +" ");
        printArrayRecursive(arr, index + 1);
    }


    public static String removeChar(String str , int index,char wordToRemove){
        if (str.length()==index) return "";

        String smallAns = removeChar(str , index+1 , wordToRemove);
        char currentChar = str.charAt(index);

        if (currentChar != wordToRemove ){
            return currentChar+smallAns;
        }else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
    RecursionPractice recursionPractice = new RecursionPractice();
  
     //   printArrayRecursive(new int[] {1,2,2,3,4,45,6,67,7,88,2}, 0);
        System.out.println(removeChar("akshay khardekar" , 0, 'h'));
    }
}

