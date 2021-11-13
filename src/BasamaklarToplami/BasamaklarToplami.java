package BasamaklarToplami;

import java.util.Scanner;

public class BasamaklarToplami {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz\t:");
        int input = scanner.nextInt();
        int yedek = input;
        int basamakSayisi = 0;
        int basamaklarToplami =0;
        int mod = input;
        //basamak sayisini bulalim.
        while(yedek !=0){
            yedek /= 10;
            basamakSayisi++;
        }
        while (basamakSayisi>0){
            basamakSayisi --;
            int basamakDegeri = (int) (mod / Math.pow(10,basamakSayisi));
            mod = (int) (mod %Math.pow(10,basamakSayisi));
            System.out.println("basamak degeri:"+basamakDegeri);
            basamaklarToplami += basamakDegeri;
        }

        System.out.println(input+"\tsayisinin basamaklar toplami\t:"+basamaklarToplami);
    }
}
