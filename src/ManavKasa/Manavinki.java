package ManavKasa;

import java.util.Scanner;

public class Manavinki {
    public static void main(String[] args) {
        double kiloArmut = 2.14;
        double kiloElma = 3.67;
        double kiloDomates = 1.11;
        double kiloMuz = 0.95;
        double kiloPatlican= 5.00;

        double tutar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armudun kilosu?");
        tutar += kiloArmut * scanner.nextDouble();
        System.out.print("Elmanin kilosu?");
        tutar += kiloElma * scanner.nextDouble();
        System.out.print("Domatesin kilosu?");
        tutar += kiloDomates * scanner.nextDouble();
        System.out.print("Muzun kilosu?");
        tutar += kiloMuz * scanner.nextDouble();
        System.out.print("Patlicanin kilosu?");
        tutar += kiloPatlican * scanner.nextDouble();

        System.out.println("Almis olduklarinizin tutari \t:"+tutar);

    }

}
