package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int greater;
        int lesser;
        int ebob =0;
        int ekok =0;
        System.out.println("Ebob Ekok bulalim.!");

        System.out.print("Ilk sayiyi giriniz.\t:");
        n1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz.\t:");
        n2 = scanner.nextInt();

        if(n1>n2){
            greater = n1;
            lesser = n2;
        }else{
            greater = n2;
            lesser = n1;
        }

        for(int i=1;i<greater;i++){
            if(i<=lesser){
                if( (n1%i ==0) && (n2%i ==0)){
                    System.out.println("ortak bolen\t:"+i);
                    ebob = i;
                }
            }else {
                break;
            }
        }

        System.out.println(n1+" ve "+n2+" sayilarinin EBOB'u\t:"+ebob);

        ekok = (n1*n2)/ebob;
        System.out.println(n1+" ve "+n2+" sayilarinin EKOK'u\t:"+ekok);
    }
}
