package Hipotenus;

import java.util.Scanner;

public class DikUcgeninAlani {

    public static void main(String[] args) {
        System.out.println("Dik ucgenin kisa kenarlarini giriniz.!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.kenar\t");
        int a = scanner.nextInt();
        System.out.println("2.kenar\t");
        int b = scanner.nextInt();

        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hipotenus\t"+c);

        double u = (a+b+c)/2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin Cevresi\t:"+u*2);
        System.out.println("Ucgenin Alani\t"+area);


    }
}
