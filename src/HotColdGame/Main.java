package HotColdGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sıcak Soğuk Oyunu");
        double sicak = 10;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int memory = random.nextInt(100);

        while (true){
            double ilik = sicak*2;
            double soguk = sicak*3;
            System.out.print("Tahminlerinizi alalım.");
            int input = scanner.nextInt();
            if(input==memory){
                System.out.println("Tebrikler!:"+memory);
                return;
            }
            if(Math.abs(memory-input)<=(int)sicak){
                sicak /= 4;
                System.out.println("Sicak");
            }else if(Math.abs(memory-input)<= (int)ilik){
                sicak /= 2;
                System.out.println("Ilık");
            }else {
                System.out.println("Soguk");
            }
        }

    }
}
