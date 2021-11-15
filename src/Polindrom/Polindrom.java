package Polindrom;

public class Polindrom {

    public static void main(String[] args) {
        /*System.out.println("1453%10\t:"+1453%10);
        System.out.println("1453/10\t:"+1453/10);
        System.out.println(digitCounter(1453));
        System.out.println(numberReverser(1453));*/

        isPolindrom(404);
        isPolindrom(302);
        isPolindrom(9889);
        isPolindrom(1);
        isPolindrom(4);
        isPolindrom(99);
    }

    public static void isPolindrom(int number){
        if(number == numberReverser(number)){
            System.out.println(number+" sayisi Polindrom Sayi");
        }else{
            System.out.println(number+" sayisi Polindrom Degil");
        }
    }

    public static int numberReverser(int number){
        int numLenght = digitCounter(number);
        if(numLenght==1){
            return number;
        }
        return (int) ((number%10)*Math.pow(10,numLenght-1) +numberReverser(number/10));
    }

    public  static  int digitCounter(int number){
        int counter = 0;
        while(number !=0){
            number /= 10;
            counter++;
        }
        return counter;
    }
}
