package AsalSayilar;

import java.util.Scanner;

public class RecursivePrimitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Asal yoklama sorgulama!\t:");
        int input = scanner.nextInt();
        asalYoklama(input, input);


    }

    private static boolean asalYoklama(int base, int i) {
        i--;
        if(i==1){
            System.out.println("Asal!");
            return true;
        }
        if(base%i==0){
            System.out.println("Asal Degil!");
            return false;
        }
        return asalYoklama(base,i);
    }
}
