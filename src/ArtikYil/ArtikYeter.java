package ArtikYil;

import java.util.Scanner;

public class ArtikYeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yil Giriniz!\t:");
        int yil = scanner.nextInt();
        boolean artik =false;

        if(yil %4 ==0){
            if(yil %100 ==0){
                if(yil %400 == 0){
                    artik = true;
                }
            }
        }
        System.out.println("Girilen yil:"+yil);
        System.out.println((artik)?"Artik yil":"Artik yil degil!");
    }
}
