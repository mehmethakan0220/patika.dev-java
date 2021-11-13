package TersPiramit;

import java.util.Scanner;

public class TersPiramit {
    public static void main(String[] args) {
        int starCount = 1;
        int loopCount;
        int spaceCount = 0;

        Scanner scanner = new Scanner(System.in);
        loopCount = scanner.nextInt();

        //bir dongu ile yildiz sayisini ayarlayalim.
        for (int i=1;i<=loopCount;i++){
            starCount += 2;
        }

        //simdi ters piramidi yazdiralim.
        for(int i=0;i<=loopCount;i++){

            //bosluklari basalim.
            for (int j=0;j<spaceCount;j++){
                System.out.print(" ");
            }

            //yildizlari basalim.
            for (int j=0;j<starCount;j++){
                System.out.print("*");
            }
            System.out.println();//bir alt satira gecelim.
            spaceCount ++; //bosluk miktarini 1 arttiriyoruz.
            starCount -= 2;// yildiz miktarini 2 azaltiyoruz.
        }

    }
}
