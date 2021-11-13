package Kombinasyon;

import java.util.Scanner;

public class Kombin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.print("C(n,r) kombinasyon hesaplamak icin 'n' degerini giriniz.\t");
        int n = scanner.nextInt();

        System.out.print("C(n,r) kombinasyon hesaplamak icin 'r' degerini giriniz.\t");
        int r = scanner.nextInt();

        double result = faktoryel(n)/(faktoryel(r)*faktoryel(n-r));

        System.out.println("C("+n+","+r+") \t="+result);
    }
    public static double faktoryel(int num){
        double result = 1;
        for(int i=1;i<=num;i++){
            result *= i;
        }
        return result;
    }
}
