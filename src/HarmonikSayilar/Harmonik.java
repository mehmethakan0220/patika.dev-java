package HarmonikSayilar;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen sayinin Harmonik serisini bulan proram!");
        System.out.print("Bir sayi giriniz!\t:");
        int num = scanner.nextInt();
        double total = 0;
        for(int i=1;i<=num;i++){
            total += (1.0/i);
            //1 = 1 + 1/2
            //1.5 = 1.5 + 1/3
        }

        System.out.println("Sonuc\t:"+total);
    }
}
