package BoksTurnuvasi;

import java.util.Scanner;

public class Fighter {
    private String name;
    private int health;
    private int weight;
    private int acceleration;
    private int morale;
    private boolean blance;
    private boolean guard;
    private boolean distance;
    private Scanner scanner;


    Fighter(){
        scanner = new Scanner(System.in);
        setName();
        setWeight();
        this.health=1000;
        this.morale=health/10;
    }

    public int hit(){
        prepareAttack();
        double rate = Math.random();
        if(rate>0.66){
            int attack = direk();
            System.out.println(this.getName()+" Direk  hasarı:"+attack);
            showStatus();
            return attack;
        }else if(rate>0.33){
            int attack = krose();
            System.out.println(this.getName()+" Krose  hasarı:"+attack);
            showStatus();
            return attack;
        }else{
            int attack = aparkat();
            System.out.println(this.getName()+" Aparkat  hasarı:"+attack);
            showStatus();
            return attack;
        }
    }

    private void prepareDefance(){
        setBlance();
        setGuard();
    }
    private void prepareAttack(){
        setDistance();
        setAcceleration();
    }

    public int direk(){
        prepareAttack();
        if(!distance){
            System.out.println(this.getName()+"Direk Saldirisi boşa gitti.");
            setMorale(getMorale()-1);
            return 0;
        }
        int base =30;
        int f = weight * acceleration;
        double damage = base + this.morale + f/10.0;
        if(isBlance()){
            return  (int) damage;
        }else{
            return  (int) damage - (getRandom010()+base);
        }
    }
    public int aparkat(){
        prepareAttack();
        if(!distance){
            System.out.println(this.getName()+"Aparkat Saldirisi boşa gitti.");
            setMorale(getMorale()-1);
            return 0;
        }
        int base =20;
        int f = weight * acceleration;
        double damage = base + this.morale + f/10.0;
        if(isBlance()){
            return  (int) damage;
        }else{
            return  (int) damage - (getRandom010()+base);
        }

    }

    public int krose(){
        prepareAttack();
        if(!distance){
            System.out.println(this.getName()+" Krose Saldirisi boşa gitti.");
            setMorale(getMorale()-1);
            return 0;
        }
        int base =10;
        int f = weight * acceleration;
        double damage = base + this.morale + f/10.0;
        if(isBlance()){
            return  (int) damage;
        }else{
            return  (int) (damage - (getRandom010()+base));
        }
    }

    public boolean block(int attack){

        prepareDefance();
        if(attack==0){
            return true;
        }
        System.out.println("Gelen Hasar:"+attack);
        if(attack>getHealth()){
            setHealth(0);
            System.out.println("Mac Bitti");
            System.out.println(this.getName()+" Yenildi!");
            return false;//game over. Fighter done..
        }

        if(isBlance() && isGuard()){
            System.out.println(getName()+" hasarı %50 azalttı. hasar:"+(attack-(attack/2)));
            attack = attack /2;
            setHealth(getHealth()-attack);
        }else if (isBlance() || isGuard()){
            System.out.println(getName()+" hasarı %25 azalttı. hasar:"+(attack-(attack/4)));
            attack = attack/4;
            setHealth(getHealth()-attack);
        }else{
            setMorale(getMorale()-1);
            System.out.println(getName()+" tüm hasarı yedi. hasar:"+attack);
            setHealth(getHealth()-attack);
        }
        showStatus();
        return true;
    }

    private void showStatus() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(getName()+"'in durumu");
        System.out.println("Denge\t:" + isBlance());
        System.out.println("Gard\t:"+isGuard());
        System.out.println("Mesafe\t:" + isDistance());
        System.out.println("Ivme\t:"+getAcceleration());
        System.out.println("Moral\t:" + getMorale());
        System.out.println("Healt\t:"+getHealth());
        System.out.println("+++++++++++++++++++++++++");
    }

    private void showHealt() {
        System.out.println("Saglik :"+this.getName()+"="+getHealth());
    }

    private boolean evasion(){
        if(getMorale()>5){
            if(getRandom010()>7){
                System.out.println(this.getName()+" saldırıdan sakıniyor.");
                setMorale(getMorale()+1);
                return true;
            }
        }
        return false;
    }

    public int getRandom010(){
        return (int) ((Math.random() * 10)+1);
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Sporcunun Adı\t:");
        this.name = scanner.nextLine();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        System.out.print(getName()+" kaç kilo\t:");
        this.weight = scanner.nextInt();
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration() {
        this.acceleration = getRandom010();
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public boolean isBlance() {
        return blance;
    }

    public void setBlance() {
        if(Math.random()>Math.random()){
            this.blance =true;
        }
        this.blance=false;
    }

    public boolean isGuard() {
        return guard;
    }

    public void setGuard() {
        if(Math.random()>Math.random()){
            this.guard =true;
            return;
        }
        this.guard= false;
    }

    public boolean isDistance() {
        return distance;
    }

    public void setDistance() {
        if(getRandom010()>2){
            this.distance =true;
            return;
        }
        this.distance= false;
    }
}
