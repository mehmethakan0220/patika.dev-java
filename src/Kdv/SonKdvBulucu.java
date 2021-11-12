package Kdv;

import java.util.Scanner;

public class SonKdvBulucu {

    public static void main(String[] args) {
        double anapara;
        System.out.print("Para girisi yapiniz.!\t:");
        Scanner scanner = new Scanner(System.in);
        anapara = scanner.nextDouble();

        System.out.println("Anapara\t:"+anapara);

        double kdvOrani;
        double kdvTutari;
        double kdvliTutar;

        if (anapara>0 || anapara<=1000){
            //kdv rate = %18
             kdvOrani = 18;
             kdvTutari = (anapara*kdvOrani/100);
             kdvliTutar = anapara + kdvTutari;
            System.out.println("KDV Orani\t:" + kdvOrani);
            System.out.println("KDV Tutari\t:"+kdvTutari);
            System.out.println("KDV'li toplam tutar\t:"+kdvliTutar);
        }else{
            //kdv rate = %8
            kdvOrani = 8;
            kdvTutari = (anapara*kdvOrani/100);
            kdvliTutar = anapara + kdvTutari;
            System.out.println("KDV Orani\t:" + kdvOrani);
            System.out.println("KDV Tutari\t:"+kdvTutari);
            System.out.println("KDV'li toplam tutar\t:"+kdvliTutar);
        }
    }
}
