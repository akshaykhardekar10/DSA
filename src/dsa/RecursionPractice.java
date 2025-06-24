package dsa;

public  class RecursionPractice {



    public static void decreasing_numbers(int n){

        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
//        n--;
        decreasing_numbers(n-1);
    }
    public static void increasing_numbers(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }
        increasing_numbers(n-1);
        System.out.println(n);
    }
    static int x=1;
    public static void factorial(int n){
        if (n == 1) {
            x*=n;
            System.out.println(x);
            return;
        }
        x=x*n;
        factorial(n-1);
    }
    public static int nth_fibonacci(int n){
        if (n==0||n==1){
            return n;
        }else{
            return nth_fibonacci(n-1)+nth_fibonacci(n-2);
        }
    }
    public static long sumOfDigits(long  n){
        if (n >=1 && n<=9) {
            return n;
        }
        n=sumOfDigits(n/10)+ n%10;
        return n;
    }

    public static void gcd(int x, int y) {
        int n = Math.min(x, y);
        gcdHelper(x, y, n);
    }
    private static void gcdHelper(int x, int y, int n) {
        if (x % n == 0 && y % n == 0) {
            System.out.println("GCD is: " + n);
            return;
        }
        gcdHelper(x, y, n - 1);
    }

    public static int gcdLongDivision(int x,int y){
        while (x % y !=0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static int gcdEuclidRecursion(int x, int y){
        if(y==0){
            return x;
        }
        return gcdEuclidRecursion(y, x%y);
    }
    public static int lcm(int x, int y ){
        return (x*y)/gcdEuclidRecursion(x,y);
    }


    public static void main(String[] args) {
//        decreasing_numbers(10);
//    increasing_numbers(14);
//        factorial(6);
//        System.out.println(nth_fibonacci(6));
//        for (int i = 0; i < 10; i++) {
//            System.out.println(nth_fibonacci(i));
//        }
//        sumOfDigits(123456);
//        System.out.println(sumOfDigits(123456));
      // gcd(12,16);
        System.out.println(gcdLongDivision(12,24));
        System.out.println(gcdEuclidRecursion(12,24));
        System.out.println(lcm(4,5));
    }
}
