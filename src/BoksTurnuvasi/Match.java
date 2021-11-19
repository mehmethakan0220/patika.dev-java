package BoksTurnuvasi;

import java.util.concurrent.TimeUnit;

public class Match {
    private Fighter blue;
    private Fighter red;
    private Ring ring;
    private Fighter attacker;
    private Fighter defancer;
    private int redAttack =0;
    private int blueAttack =0;
    private int totalAttack=0;
    private int redPunch=0;
    private int bluePunch=0;
    private int totalPunch=0;

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

                if(attacker.equals(getRed())){
                    setRedPunch();
                }else
                    setBluePunch();

                showStatus();
                if(!defancer.block(attacker.hit())){
                    showAttackResults();
                    checkWinner(getRed(),getBlue());
                    return;
                }

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void showStatus() {
        System.out.println("────────────────────────────────────────────");
        System.out.println(getRed().getName()+" vs "+getBlue().getName());
        System.out.println("Denge\t:" + red.getName() + getSign(red.isBlance(),blue.isBlance()) +blue.getName() );
        System.out.println("Gard\t:" + red.getName() + getSign(red.isGuard(),blue.isGuard()) +blue.getName() );
        System.out.println("Mesafe\t:" + red.getName() + getSign(red.isDistance(),blue.isDistance()) +blue.getName() );
        System.out.println("Ivme\t:" + red.getName() +" "+ red.getAcceleration() + " : "+ blue.getAcceleration() + " " +blue.getName() );
        System.out.println("Moral\t:" + red.getName() +" "+ red.getMorale() + " : "+ blue.getMorale() + " " +blue.getName() );
        System.out.println("Sağlık\t:" + red.getName() +" "+ red.getHealth() + " : "+ blue.getHealth() + " " +blue.getName() );
        System.out.println("────────────────────────────────────────────");
    }
    private String getSign(boolean a, boolean b){
        if(a && b){
            return "=";
        }else if(a){
            return ">";
        }
        return "<";
    }

    private void checkWinner(Fighter red, Fighter blue) {
        System.out.println("────────────WINNER───────────");
        if(red.getHealth()>blue.getHealth()){
            System.out.println("\t\t\t"+red.getName());
        }else{
            System.out.println("\t\t\t"+blue.getName());
        }
        System.out.println("──────────────────────────────");
    }

    private boolean checkHealts(){
        if(this.attacker.getHealth()>0 && this.defancer.getHealth()>0){
            return true;
        }
        return false;
    }

    private void showAttackResults(){
        System.out.println("─────────────────RATES───────────────────");
        System.out.println("Red\t:"+getRed().getName());
        System.out.println("Attack repetition\t:"+ getRedAttack() +"/"+getTotalAttack());
        System.out.println("Punch rate\t:"+getRedPunch()+"/"+getTotalPunch());
        System.out.println("──────────────────────────────────────────");
        System.out.println("Blue\t:"+getBlue().getName());
        System.out.println("Attack repetition\t:"+ getBlueAttack() +"/"+getTotalAttack());
        System.out.println("Punch rate\t:"+getBluePunch()+"/"+getTotalPunch());
    }

    private void attackOrder(){
        if(getRandom01()>=getRandom01()){
             setAttacker(getRed());
             setDefancer(getBlue());
             setRedAttack();
            return;
        }
        setAttacker(getBlue());
        setDefancer(getRed());
        setBlueAttack();
    }
    private int attackCount(){
        if(getRandom01()<getRandom01() && getRandom01()>getRandom01()){
            return 3;
        }else if (getRandom01()>getRandom01()){
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

    public int getRedAttack() {
        return redAttack;
    }

    public void setRedAttack() {
        this.redAttack ++;
        setTotalAttack();
    }

    public int getBlueAttack() {
        return blueAttack;
    }

    public void setBlueAttack() {
        this.blueAttack ++;
        setTotalAttack();
    }

    public int getTotalAttack() {
        return totalAttack;
    }

    private void setTotalAttack() {
        this.totalAttack++;
    }

    public int getRedPunch() {
        return redPunch;
    }

    public void setRedPunch() {
        this.redPunch ++;
        setTotalPunch();
    }

    public int getBluePunch() {
        return bluePunch;
    }

    public void setBluePunch() {
        this.bluePunch ++;
        setTotalPunch();
    }

    public int getTotalPunch() {
        return totalPunch;
    }

    private void setTotalPunch() {
        this.totalPunch ++;
    }
}
