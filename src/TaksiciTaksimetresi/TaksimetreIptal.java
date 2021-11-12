package TaksiciTaksimetresi;

import java.util.Scanner;

public class TaksimetreIptal {

    public static void main(String[] args) {
        System.out.println("Yolun uzunlugunu giriniz (KM)");

        double kmUnitPrice = 2.20;
        int minPrice = 20;
        int taksimetreStartPrice = 10;

        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();

        double result =taksimetreStartPrice + (km * kmUnitPrice);

        if(result<=20){
            System.out.println("Odemeniz Gereken Tutar\t"+ minPrice);
        }else{
            System.out.println("Odemeniz Gereken Tutar\t"+result);
        }
    }
}
