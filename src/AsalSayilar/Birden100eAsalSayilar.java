package AsalSayilar;

public class Birden100eAsalSayilar {
    public static void main(String[] args) {
        //1'den 100'e bir dongu calistiralim.
        for(int i = 1; i<=100;i++){
            boolean isPrimitive = true;
            //isPrimitive degiskeni asallik ozelligini ifade eder
            if(i==1){
                //1 asal sayi kabul edilmedigi icin 1 icin islem adimlarini atliyoruz.
                continue;
            }
            for(int j = 2;j<i;j++){
                if(i%j ==0){
                    //isPrimitive false olursa bu demektir ki
                    // i sayisinin 1 ve kendisinden baska bolenleri var
                    //bu durumda asallik bozulacaktir.
                    isPrimitive = false;
                }
            }
            if(isPrimitive){
                //asallik bozulmamis ise i degerini yazdiriyoruz.
                System.out.print(i+" ");
            }
        }
    }
}
