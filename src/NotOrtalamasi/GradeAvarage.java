package NotOrtalamasi;

import java.util.Scanner;

public class GradeAvarage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;
        double avarage;
        print("matematik");
        mat = scanner.nextInt();
        print("fizik");
        fizik = scanner.nextInt();
        print("kimya");
        kimya = scanner.nextInt();
        print("turkce");
        turkce = scanner.nextInt();
        print("tarih");
        tarih = scanner.nextInt();
        print("muzik");
        muzik = scanner.nextInt();

        avarage = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Ortalamaniz:\t"+avarage);
        System.out.println((avarage>60)?"gectiniz!":"kaldiniz");
    }
     static void print(String str){
        System.out.println(str + "\tnotunuzu giriniz.");
    }
}
