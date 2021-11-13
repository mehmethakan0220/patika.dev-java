package InputSorter;

import java.util.*;
import java.util.stream.IntStream;

public class Girilen3Sayi {

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz.");
        n1 = scanner.nextInt();

        System.out.print("ikinci sayiyi giriniz.");
        n2 = scanner.nextInt();

        System.out.print("ucuncu sayiyi giriniz.");
        n3 = scanner.nextInt();

        int[] liste = new int[]{n1,n2,n3};

        Arrays.sort(liste);
        System.out.println("*************Result***************");
        for(int item:liste){
            System.out.println(item);
        }







    }
}
