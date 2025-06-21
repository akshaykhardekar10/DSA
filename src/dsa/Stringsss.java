package dsa;
import java.util.Arrays;
import java.util.Scanner;

// Strings -> interning -> poor performance -> immutability ->
// == checks the reference/address and .equals() checks actual value


public class Stringsss {
    public static void comparingg(String a,String b){
        //compareTo() gives lexographically output
        //if a if bigger than b +ve ans , if equal ans=0 , if b>a asn -ve
        System.out.println(a.compareTo(b));
        System.out.println(a.substring(0,6));
        Scanner scanner=new Scanner(System.in);
       
    }

    public static void Patternss(String str){

        for (int i = 0; i <=str.length(); i++) {
            for (int j = i+1; j <str.length()+1 ; j++) {
                System.out.println(str.substring(i,j));
//                System.out.println(" ");
            }
        }
    }

    public static void toggle(String str){

//akSHAy    65-90 ABCD
//AKshaY    97-122 abcd
        StringBuilder sb= new StringBuilder(str);
        System.out.println(sb);
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            int ascii = (int) ch;
            if (ascii >=65 && ascii<=90 ){

                ascii+=32;
                char vh = (char) ascii;
                sb.setCharAt(i,vh);
            } else if (ascii >=97 && ascii<=122) {
                ascii-=32;
                char vh=(char) ascii;
                sb.setCharAt(i,vh);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        //     comparingg("akshay" ,"akshay");
        //       comparingg("a","b");
        //       comparingg("c", "a");
        //Patternss("abcd");
   

toggle("Aksh1342Ay khaRd23eKAr");
    }
}
