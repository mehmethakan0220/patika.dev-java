package OddEvenRepeats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,9,1,3,2,0,7,4,2,7,9,10,20,12,18,4,8,6,12,18,14,9,5,10,20};
        int [] controlArray = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(getIndex(controlArray,numbers[i])==-1){
                if(isRepats(numbers,numbers[i])){
                    System.out.println(numbers[i]+" repeats");
                }
                controlArray[i]=numbers[i];
            }
        }

    }
    /*returns the first encountered item*/
    public static int getIndex(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static boolean isRepats(int[] arr,int num){
        int counter = 0;
        for(int i:arr){
            if(i==num){
                counter++;
                if(counter>1){
                    return true;
                }
            }
        }
        return false;

    }
}
