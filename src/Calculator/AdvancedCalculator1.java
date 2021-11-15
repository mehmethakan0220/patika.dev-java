package Calculator;

import java.util.Scanner;

public class AdvancedCalculator1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        String taslak = "" +
                "1)Toplama\n" +
                "2)Cikarma\n" +
                "3)Carpma\n" +
                "4)Bolme\n" +
                "5)mod\n" +
                "6)us\n" +
                "0)←\n" +
                "Lutfen işleminizi seçiniz.(Çıkmak için 0)\t:";

        do {
            System.out.print(taslak);
            input = scanner.nextInt();
            switch (input){
                case 0:
                    return;
                case 1:
                    toplama(scanner);
                    break;
                case 2:
                    cikarma(scanner);
                    break;
                case 3:
                    carpma(scanner);
                    break;
                case 4:
                    bolme(scanner);
                    break;
                case 5:
                    mod(scanner);
                    break;
                case 6:
                    us(scanner);
                    break;
                default:
                    System.out.println("Hatalı işlem numarası!!!");
            }
        }while (true);

    }

    private static void bolme(Scanner scanner) {
        System.out.println(inputAl(scanner)/inputAl(scanner));
    }

    private static void carpma(Scanner scanner) {
        System.out.println(inputAl(scanner)*inputAl(scanner));
    }

    private static void mod(Scanner scanner) {
        System.out.println(inputAl(scanner)%inputAl(scanner));
    }

    private static void us(Scanner scanner) {
        System.out.println(Math.pow(inputAl(scanner),inputAl(scanner)));
    }

    private static void cikarma(Scanner scanner) {
        System.out.println(inputAl(scanner)-inputAl(scanner));
    }

    private static void toplama(Scanner scanner) {
        System.out.println(inputAl(scanner)+inputAl(scanner));
    }

    private static double inputAl(Scanner scanner){
        System.out.print("Bir sayı giriniz \t:");
        return  scanner.nextDouble();
    }



}
