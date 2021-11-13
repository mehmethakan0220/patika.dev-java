package Calculator;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islem;
        double n1;
        double n2;
        System.out.print("Islem seciniz. + - * / \t");
        islem = scanner.nextLine();

        switch (islem){
            case "+":
                n1Gir();
                n1 = scanner.nextDouble();
                n2Gir();
                n2 = scanner.nextDouble();
                System.out.println("Sonuc\t:"+(n1+n2));
                break;
            case "-":
                n1Gir();
                n1 = scanner.nextDouble();
                n2Gir();
                n2 = scanner.nextDouble();
                System.out.println("Sonuc\t:"+(n1-n2));
                break;
            case "*":
                n1Gir();
                n1 = scanner.nextDouble();
                n2Gir();
                n2 = scanner.nextDouble();
                System.out.println("Sonuc\t:"+(n1*n2));
                break;
            case "/":
                n1Gir();
                n1 = scanner.nextDouble();
                n2Gir();
                n2 = scanner.nextDouble();
                System.out.println("Sonuc\t:"+(n1/n2));
                break;
            default:
                System.out.println("Hatali islem operatoru!");
        }
    }
    public static void n1Gir(){
        System.out.print("ilk sayiyi giriniz.\t");
    }
    public static void n2Gir(){
        System.out.print("ilk sayiyi giriniz.\t");
    }
}
