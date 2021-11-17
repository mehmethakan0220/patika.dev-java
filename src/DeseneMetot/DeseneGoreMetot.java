package DeseneMetot;

import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz.\t:");
        int sayi = scanner.nextInt();
        deseneGel(sayi,sayi,false);
    }

    private static void deseneGel(int number,int temp, boolean isZero) {
        if(number>0 && !isZero){
            System.out.print(number+" ");
            number-=5;
        }else{
            isZero=true;
        }

        if (isZero){
            System.out.print(number+" ");
            number+=5;
            if(temp==number){
                System.out.print(number+" ");
                return;
            }
        }

        deseneGel(number,temp,isZero);
    }
}
