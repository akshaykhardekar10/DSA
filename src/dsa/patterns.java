package dsa;

import java.util.Scanner;

public class patterns {


    public static void p1 (int n){
        for (int i=0; i< n ; i++){
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p2 (int n){
        for (int i=0; i< n ; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*n-(2*i+1) ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void p3 (int n){
        for (int i=0; i<=2*n-1 ; i++) {

            int stars=i;
            if (i>n){
                stars=2*n-i;
            }
            for (int j = 0; j <stars; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
    public static void p4 (int n){
        int num=1;
        for (int i=0; i<=n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(num +" ");
                num++;
            }
            System.out.println(" ");
        }
    }
    public static void p5 (int n){
        int num=1;
        for (int i=0; i<=n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(num +" ");
                num++;
            }
            System.out.println(" ");
        }
    }





    public static void main(String[] args) {
        System.out.println("this is a class for printing patterns");

        Scanner sc=new Scanner(System.in);

        int[] arr;

        arr= new int[]{1,2,3,4,5,6};

        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());

//p1(5);
//p2(5);
//p3(5);
//p4(5);
//
/* fdg */
    }
}
