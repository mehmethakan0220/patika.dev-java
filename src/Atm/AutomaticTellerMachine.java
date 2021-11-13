package Atm;

import java.util.Scanner;

public class AutomaticTellerMachine {
    public static void main(String[] args) {
        int right =3;
        int pass = 5432;
        int bakiye = 3000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kartinizi Takiniz.\t:");
        while(right>0){
            System.out.print("Sifreyi Giriniz.\t:");
            int passInput = scanner.nextInt();
            if(passInput != pass){
                right--;
                System.out.println("Yanlis Sifre Girdiniz. Kalan deneme hakkiniz\t:"+right);
                if(right==0){
                    System.out.println("Hesabiniz bloke olmustur.");
                    return;
                }
            }else{
                System.out.println("Kod Bankasina Hosgeldiniz.!");
                while(true){
                    System.out.println("" +
                            "1-) Bakiye Sorgula\n" +
                            "2-) Para Yatir\n" +
                            "3-) Para Cek\n" +
                            "4-) Iptal/Kart Iade");
                    System.out.print("Lutfen Yapmak Istediginiz Islemin Numarasini Girin\t:");
                    int islem = scanner.nextInt();
                    int miktar=0;
                    switch (islem){
                        case 1:
                            System.out.println("\nHesabinizda "+bakiye+" TL bulunmaktadir.");break;
                        case 2:
                            System.out.print("Yatirmak istediginiz miktari giriniz.\t:");
                            miktar = scanner.nextInt();
                            if(miktar>0){
                                bakiye += miktar;
                                System.out.println("Bakiyenize "+miktar+"TL eklendi");
                            }else{
                                System.out.println("Hatali miktar girdiniz.");
                            }
                            break;
                        case 3:
                            System.out.print("Cekmek istediginiz miktari giriniz.\t:");
                            miktar = scanner.nextInt();
                            if(miktar>0 && miktar<=bakiye){
                                bakiye -= miktar;
                                System.out.println("Bakiyenizden "+miktar+"TL cekildi.");
                            }else{
                                System.out.println("Yetersiz Bakiye");
                                System.out.println("Bakiyeniz\t:"+bakiye);
                            }
                            break;
                        case 4:
                            System.out.println("Bizi sectiginiz icin tesekkur ederiz.!");
                            return;
                        default:
                            System.out.println("Gecersiz islem adimi!!!");

                    }
                }
            }
        }
    }
}
