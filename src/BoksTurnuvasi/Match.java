package BoksTurnuvasi;

import java.nio.file.FileStore;
import java.util.concurrent.TimeUnit;

public class Match {
    private Fighter blue;
    private Fighter red;
    private Ring ring;
    private Fighter attacker;
    private Fighter defancer;

    public Match(Fighter blue, Fighter red) {
        this.blue = blue;
        this.red = red;
        this.ring = new Ring(red,blue);
    }

    public void run(){
        if(ring.checkWeight(blue) || ring.checkWeight(red)){
            return;
        }
        System.out.println("TıngTıngTıng maç başladi.");
        while (true){
            attackOrder();
            if(!checkHealts()){

                return;//mac biter.
            }
            int attackCount = attackCount();
            for(int i=0;i<attackCount;i++){
                System.out.println("'\n\n\n\n\n\n\n'");
                System.out.println(this.attacker.getName()+" "+(i+1)+". saldırı");
                if(!defancer.block(attacker.hit())){
                    checkWinner();
                    return;
                }

                try {
                    TimeUnit.SECONDS.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private boolean checkHealts(){
        if(this.attacker.getHealth()>0 && this.defancer.getHealth()>0){
            return true;
        }
        return false;
    }
    private void checkWinner(){
        if(getRed().getHealth()> getBlue().getHealth()){
            System.out.println("" +
                    "*******Winner**********\n" +
                    "\t\t"+getRed().getName()+"\n" +
                    "**************************\n");
            return;
        }
        System.out.println("" +
                "*******Winner**********\n" +
                getBlue().getName()+"\n" +
                "**************************\n");

    }

    private void attackOrder(){
        if(getRandom01()>0.5){
             setAttacker(getRed());
             setDefancer(getBlue());
            return;
        }
        setAttacker(getBlue());
        setDefancer(getRed());
    }
    private int attackCount(){
        if(getRandom01()>0.6){
            return 3;
        }else if (getRandom01()>0.3){
            return 2;
        }else
            return 1;
    }

    //getter and setters
    private Fighter getBlue() {
        return blue;
    }

    public void setBlue(Fighter blue) {
        this.blue = blue;
    }

    public Fighter getRed() {
        return red;
    }

    public void setRed(Fighter red) {
        this.red = red;
    }

    private Fighter getAttacker() {
        return attacker;
    }

    private void setAttacker(Fighter attacker) {
        this.attacker = attacker;
    }
    private double getRandom01(){
        return Math.random();
    }

    private Fighter getDefancer() {
        return defancer;
    }

    private void setDefancer(Fighter defancer) {
        this.defancer = defancer;
    }
}
