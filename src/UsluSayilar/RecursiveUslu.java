package UsluSayilar;

import java.util.Scanner;

public class RecursiveUslu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban degeri giriniz\t:");
        int taban = scanner.nextInt();
        System.out.print("Us degeri giriniz\t:");
        int us = scanner.nextInt();
        System.out.println("İşlemin sonucu\t:"+usAl(taban,us));
    }

    private static int usAl(int alt, int ust) {
        if(ust==0)
            return 1;
        return alt * usAl(alt,ust-1);
    }


}
