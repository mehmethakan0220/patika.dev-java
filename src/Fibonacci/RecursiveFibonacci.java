package Fibonacci;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        fibo(0,1,10);
        System.out.println();
        int result = fibonacci(10);
        System.out.println("10.eleman: "+result);

    }

    public static void fibo(int first,int second,int n){
        if(n==0)
            return;

        System.out.print(first+" ");

        fibo(second,first+second,n-1);
    }

    public static int fibonacci(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    /*
    fib(5)=fib(4)+fib(3)
    fib(4)=fib(3)+fib(2)
    fib(3)=fib(2)+fib(1)
    fib(2)= 1+0

    */

}
