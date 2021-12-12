package IsStringPolindrom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz:\t");
        String input = scanner.nextLine();
        for (int i=0,j = input.length()-1; i < input.length(); i++,j--) {
            if(input.charAt(i)!=input.charAt(j)){
                System.out.println(input+" is not polindrom");
                return;
            }
        }
        System.out.println(input+" is polindrom");
        scanner.close();
    }
}
