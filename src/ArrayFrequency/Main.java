package ArrayFrequency;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        for(int i=0;i<arr.length;i++){
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            System.out.println(arr[i]+" sayısı dizide "+counter+" defa geçiyor.");
        }
    }
}
