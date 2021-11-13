package ZodiacProject;

import java.util.Scanner;

public class HeleBurcunuSoyle {

    public static void main(String[] args) {

        int mounth =0;
        int day = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dogdugunuz ay ornegin(5)\t:");
        mounth = scanner.nextInt();

        System.out.println("Ayin kacinci gunu dogdunuz ornegin (11)\t:");
        day = scanner.nextInt();

        if(mounth ==1){
            if (day<=21){
                System.out.println("Oglak");
            }else if (day>21 && day<=31){
                System.out.println("Kova");
            }else{
                System.out.println("Gecersiz gun");
            }

        }else if (mounth==2){
            if (day<=19){
                System.out.println("Kova");
            }else if (day>19 && day<=31){
                System.out.println("Balik");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==3){
            if (day<=20){
                System.out.println("Balik");
            }else if (day>20 && day<=31){
                System.out.println("Koc");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==4){
            if (day<=20){
                System.out.println("Koc");
            }else if (day>20 && day<=31){
                System.out.println("Boga");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==5){
            if (day<=21){
                System.out.println("Boga");
            }else if (day>21 && day<=31){
                System.out.println("Ikiz");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==6){
            if (day<=22){
                System.out.println("Ikiz");
            }else if (day>22 && day<=31){
                System.out.println("Yengec");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==7){
            if (day<=22){
                System.out.println("Yengec");
            }else if (day>22 && day<=31){
                System.out.println("Aslan");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==8){
            if (day<=22){
                System.out.println("Aslan");
            }else if (day>22 && day<=31){
                System.out.println("Basak");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==9){
            if (day<=22){
                System.out.println("Basak");
            }else if (day>22 && day<=31){
                System.out.println("Terazi");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==10){
            if (day<=21){
                System.out.println("Terazi");
            }else if (day>21 && day<=31){
                System.out.println("Akrep");
            }else{
                System.out.println("Gecersiz gun");
            }
        }
        else if (mounth==11){
            if (day<=21){
                System.out.println("Akrep");
            }else if (day>21 && day<=31){
                System.out.println("Yay");
            }else{
                System.out.println("Gecersiz gun");
            }
        }else if (mounth==12){
            if (day<=21){
                System.out.println("Yay");
            }else if (day>21 && day<=31){
                System.out.println("Oglak");
            }else{
                System.out.println("Gecersiz gun");
            }
        }else{
            System.out.println("1 ile 12 arasinda ay degeri giriniz!.");
        }
    }
}
