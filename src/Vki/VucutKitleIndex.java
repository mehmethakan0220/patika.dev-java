package Vki;

import java.util.Scanner;

public class VucutKitleIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double vki;
        System.out.print("Kilonuzu giriniz \t:");
        weight = scanner.nextDouble();
        System.out.print("Boyunuzu giriniz \t:");
        height = scanner.nextDouble();

        vki = weight / height * height;
        System.out.println("Vucut Kitle Indeksiniz \t"+vki);
    }
}
