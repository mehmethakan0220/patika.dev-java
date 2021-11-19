package BoksTurnuvasi;

import java.util.Scanner;

public class Ring {
    Fighter redCorner;
    Fighter blueCorner;
    private int minWeight;
    private int maxWeight;
    private Scanner scanner;

    public Ring(Fighter redCorner, Fighter blueCorner) {
        this.redCorner = redCorner;
        this.blueCorner = blueCorner;
        scanner = new Scanner(System.in);
        this.setMinWeight();
        this.setMaxWeight();
    }

    public  boolean checkWeight(Fighter fighter){
        if(fighter.getWeight()<minWeight){
            System.out.println(fighter.getName()+" kilo alt sınırını geçemedi!");
            return true;
        }
        if(fighter.getWeight()>maxWeight){
            System.out.println(fighter.getName()+" kilo üst sınırını geçti!");
            return true;
        }
        return false;
    }


    public int getMinWeight() {
        return minWeight;
    }
    public void setMinWeight() {
        System.out.print("Kilo alt sınırı belirleyiniz\t:");
        this.minWeight = this.scanner.nextInt();
    }
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight() {
        System.out.print("Kilo üst sınırı belirleyiniz\t:");
        this.maxWeight = this.scanner.nextInt();
    }
}
