package NearestArrayItem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        System.out.print("Bir sayı giriniz\t:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int nearestLess = getMin(numbers);
        int nearestGreater = getMax(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>nearestLess && numbers[i]<input){
                nearestLess = numbers[i];
            }
            if(numbers[i]<nearestGreater && numbers[i]>input){
                nearestGreater = numbers[i];
            }
        }
        System.out.println("Girilen sayıyadan kucuk en yakin sayi:\t"+nearestLess);
        System.out.println("Girilen sayıyadan buyuk en yakin sayi:\t"+nearestGreater);

    }



    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
