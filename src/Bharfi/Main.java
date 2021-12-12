package Bharfi;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[7][5];
        /*creat B letter*/
       arr = fillStar(arr,1);
       print(arr);
       /*creat E letter*/
        arr = fillStar(arr,0);
        print(arr);
        arr = fillStar(arr,1);
        print(arr);
        /*creat E letter*/
        arr = fillStar(arr,0);
        print(arr);

    }
    public static void print(String[][] arr){
        for(String[] row:arr){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static String[][] fillStar(String[][] arr,int bMieMi){
        int borderTop= 0;
        int borderBot= arr.length-1;
        int borderMid= (borderBot+borderTop)/2;
        int borderLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            int borderRight= arr[i].length -bMieMi;
            for (int j = 0; j < arr[i].length; j++) {
                if(i==borderTop || i==borderBot || i==borderMid){
                    if(borderMid==i){
                        if(j<borderRight){
                            arr[i][j] = "*";
                        }
                        else{
                            arr[i][j] = " ";
                        }
                    }else{
                        arr[i][j] = "*";
                    }
                }else {
                    if(j==borderLeft || j==borderRight){
                        arr[i][j] = "*";
                    }else{
                        arr[i][j] = " ";
                    }
                }
            }

        }
        return arr;
    }
}
