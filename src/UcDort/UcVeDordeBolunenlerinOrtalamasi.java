package UcDort;

import java.util.Scanner;

public class UcVeDordeBolunenlerinOrtalamasi {

    public static void main(String[] args) {

        int limit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz.!\t:");
        limit = scanner.nextInt();
        int total=0;
        int amount = 0;
        for(int i=1;i<=limit;i++){
            if (i%3== 0 && i%4==0){
                System.out.print("|"+i);
                total +=i;
                amount ++;
            }
        }
        System.out.println("|\n3'e ve 4'e tam bolunen "+amount+" adet sayinin ortalamasi\t:"+total/amount);
    }
}
