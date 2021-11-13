package GradeAvarage;

import java.util.Scanner;

public class GavurIsi {

    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        Scanner scanner = new Scanner(System.in);
        int checkTotal = 0;
        int gradeTotal = 0;
        int mat,fiz,tur,kim,muz;

        System.out.print("Matematik notunuzu giriniz \t:");
        mat = scanner.nextInt();
        checkTotal += checkIt(mat);
        if(checkIt(mat) == 1){
            gradeTotal += mat;
        }

        System.out.print("Fizik notunuzu giriniz \t:");
        fiz = scanner.nextInt();
        checkTotal += checkIt(fiz);
        if(checkIt(fiz) == 1){
            gradeTotal += fiz;
        }

        System.out.print("Turkce notunuzu giriniz \t:");
        tur = scanner.nextInt();
        checkTotal += checkIt(tur);
        if(checkIt(tur) == 1){
            gradeTotal += tur;
        }

        System.out.print("Kimya notunuzu giriniz \t:");
        kim = scanner.nextInt();
        checkTotal += checkIt(kim);
        if(checkIt(kim) == 1){
            gradeTotal += kim;
        }

        System.out.print("Muzik notunuzu giriniz \t:");
        muz = scanner.nextInt();
        checkTotal += checkIt(muz);
        if(checkIt(muz) == 1){
            gradeTotal += muz;
        }

        evaluation(gradeTotal,checkTotal);
    }
    public static int checkIt(int grade){
        if(grade >=0 && grade <=100){
            return 1;
        }else{
            return 0;
        }
    }
    public static void evaluation(int total,int amount){
        System.out.println("Degerlendirmeye alinan not sayisi \t"+amount);
        System.out.println("Ortalamaniz\t"+(total/amount));
        System.out.println(((total/amount)>55)?"Gectiniz!":"Kaldiniz!");
    }
}
