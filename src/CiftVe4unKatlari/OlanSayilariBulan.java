package CiftVe4unKatlari;

import java.util.Scanner;

public class OlanSayilariBulan {

    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
        eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        * */

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true){
            System.out.print("Yeni Bir Sayi Girin.\t:");
            int input = scanner.nextInt();
            if(input%2==0){
                if(input%4==0){
                    total += input;
                }
            }else{
                System.out.println("Sayilarin Toplami "+total);
                break;
            }
        }
    }
}
