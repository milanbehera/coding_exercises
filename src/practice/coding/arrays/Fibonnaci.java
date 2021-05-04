package practice.coding.arrays;

public class Fibonnaci {

    public static int fib(int n) {
        int fib = 0;
        int [] fibArr = new int[n];
        fibArr[0] = 1;
        fibArr[1] = 1;
        for(int i = 2 ;i < n; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
            System.out.println(fibArr[i]);
        }
        return fib;

    }

    public static void main(String []s) {
        fib(10);
    }
}
