package Suggestor;

import java.util.Scanner;

public class EventSuggester {
    public static void main(String[] args) {

        System.out.println("Hava Kac Derece C?");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        /*
        *     Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    * */

        if(temperature < 5){
            System.out.println("Kayak icin musait kosullar.");
        }
        if(temperature >=5 && temperature<=15){
            System.out.println("Sinema icin musait kosullar.");
        }
        if(temperature > 15 && temperature<=25){
            System.out.println("Piknik icin musait kosullar.");
        }
        if(temperature > 25){
            System.out.println("Yuzmek icin uygun sicaklik.");
        }
    }
}
