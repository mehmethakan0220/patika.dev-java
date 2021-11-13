package UsluSayilar;

import java.util.Scanner;

public class UsluDur {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban degeri giriniz \t:");
        int taban = scanner.nextInt();

        System.out.print("Kuvvet degeri giriniz \t:");
        int kuvvet = scanner.nextInt();

        double result = 1;

        for(int i=0;i<kuvvet;i++){
            result *= taban;
        }

        System.out.println(taban+"^"+kuvvet+"\t="+result);
    }
}
