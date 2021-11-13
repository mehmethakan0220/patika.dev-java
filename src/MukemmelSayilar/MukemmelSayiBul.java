package MukemmelSayilar;

import java.util.Scanner;

public class MukemmelSayiBul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz \t:");
        int num = scanner.nextInt();
        int total = 0;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                total +=i;
            }
        }

        if(total == num){
            System.out.println(num+" sayisi bir mukemmel sayidir.");
        }else{
            System.out.println(num+" sayisi bir mukemmel sayi degildir.");
        }

    }
}
