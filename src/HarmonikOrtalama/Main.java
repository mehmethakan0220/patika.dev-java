package HarmonikOrtalama;

public class Main {

    public static void main(String[] args) {
        int[] dizi1 = {3,5,6,9,2,6};
        double harmonikOrtalama = (double) dizi1.length/hormonikSeri(dizi1);
        System.out.println("H.O:\t"+harmonikOrtalama);
    }
    static double hormonikSeri(int[] arr){
        double hs=0.0;
        for (int i = 0; i < arr.length; i++) {
            hs = hs + 1.0/arr[i];
        }
        return hs;
    }
}
