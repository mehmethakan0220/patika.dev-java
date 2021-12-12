package ArraySortingAsc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArrayFromConsole();

        showToUncles(shortIt(arr));
    }

    private static int[] shortIt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    private static void showToUncles(int[] arr) {
        for(int item:arr){
            System.out.print(item+" ");
        }
    }

    /* create an array with console user*/
    private static int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu belirleyin:\t");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print(i+1+". elemanı giriniz:\t");
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}
