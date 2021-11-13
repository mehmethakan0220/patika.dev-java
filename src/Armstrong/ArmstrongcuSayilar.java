package Armstrong;

import java.util.Scanner;

public class ArmstrongcuSayilar {

    /*
    * N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
    * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz.\t:");
        int input = scanner.nextInt();
        //kullanicidan giris al

        int basamakSayisi =0;
        int temp = input;

        //basamak sayisinin hesaplandigi while dongusu
        while (temp != 0){
         temp /= 10;
         basamakSayisi ++;
        }
        //sayinin kac basamaktan olustugunu bildiriyoruz.
        System.out.println("Girdiginiz "+input+" Sayisi "+basamakSayisi+" basamaklidir.");

        int basamakDegeri = input;
        double mod = input;
        int total = 0;
        int tempBasamakSayisi = basamakSayisi;

        while (tempBasamakSayisi>0){
            //basamakSayisi kadar donen while dongusu
            tempBasamakSayisi--;
            //basamakdegeri = 407 / Math.pow(10,2) = 4
            basamakDegeri = (int) (mod /(Math.pow(10,(tempBasamakSayisi))));
            System.out.println("basamak degeri\t:"+basamakDegeri);
            //mod = 407%100 = 7
            mod = mod % (Math.pow(10,(tempBasamakSayisi)));
            System.out.println("mod\t:"+mod);

            //her basamak degerinin BasamakSayisi kuvvetini hesaplayip totalde topluyoruz.
            //boylece 4^3 + 0 ^3 + 7^3 = 407 oldugunu buluyoruz.
            total += Math.pow(basamakDegeri,basamakSayisi);
            System.out.println("total\t:"+total);
            System.out.println("------------");
        }

        //4^3 + 0 ^3 + 7^3 = 407  == 407 mi?
        if(total == input){
            System.out.println("Armstrong Sayi");
        }else{
            System.out.println("Armstrong Degil");
        }
    }
}
