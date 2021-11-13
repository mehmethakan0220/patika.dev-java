package MinMaxFinder;

import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {

        int iterate;
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac sayi gireceksiniz.\t:");
        iterate = scanner.nextInt();

        for(int i=0;i<iterate;i++){
            System.out.print("Sayi gir\t:");
            int input = scanner.nextInt();
            if(i ==0){
                min = input;
                max = input;
            }
            if(input < min){
                min =input;
            }
            if(input > max){
                max = input;
            }
        }
        System.out.println("Sayilarin en buyugu\t:"+max);
        System.out.println("Sayilarin en kucugu\t:"+min);

    }
}
