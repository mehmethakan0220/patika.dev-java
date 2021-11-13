package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 1;
        int onceki = 0;
        int kendisi = 1;
        while (true){

            System.out.print(onceki+" ");
            int temp = kendisi;
            kendisi = kendisi+onceki;
            onceki = temp;

            i++;
            if(i>10){
                // 10 elemana kadar basmasina izin veriyor.
                break;
            }
        }
    }
}
