package MatrisTranspose;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][] matris = getMatrisFromUser();
        int [][] transpose = getTranpose(matris);
        int [][] check = getTranpose(transpose);
        System.out.println("Before");
        print(matris);
        System.out.println("After");
        print(transpose);
        System.out.println("Check!");
        print(check);
        System.out.println("Işlem tamamlandı.");
    }
    private static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[][] getTranpose(int[][] matris){
        int [][] transpose = new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpose[j][i] = matris[i][j];
            }
        }
        return transpose;
    }

    private static int[][] getMatrisFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matris sutun sayisi giriniz\t");
        int row = scanner.nextInt();
        System.out.print("Matris satır sayisi giriniz\t:");
        int col = scanner.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((i+1)+".satir, "+(j+1)+".sutun degerini giriniz:\t");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Transpoz islemi başladı");
        return arr;
    }

}

