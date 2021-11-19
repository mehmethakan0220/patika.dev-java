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
        this.health=500;
        this.morale=health/10;
    }

    public int hit(){
        prepareAttack();
        double rate = Math.random();
        if(rate>0.66){
            int attack = direk();
            System.out.println(this.getName()+" Direk  hasarı:"+attack);
            return attack;
        }else if(rate>0.33){
            int attack = krose();
            System.out.println(this.getName()+" Krose  hasarı:"+attack);
            return attack;
        }else{
            int attack = aparkat();
            System.out.println(this.getName()+" Aparkat  hasarı:"+attack);
            return attack;
        }
    }

    private void prepareDefance(){
        setBlance();
        setGuard();
        setDistance();
    }
    private void prepareAttack(){
        setDistance();
        setAcceleration();
    }

    public int direk(){
        prepareAttack();
        if(!distance){
            System.out.println(this.getName()+" Direk Saldirisi boşa gitti.");
            setMorale(getMorale()-1);
            return 0;
        }
        int base =30;
        int f = weight * acceleration;
        double damage = base + this.morale + f/10.0;
        if(isBlance()){
            return  (int) damage;
        }else{
            return  (int) damage - base;
        }
    }
    public int aparkat(){
        prepareAttack();
        if(!distance){
            System.out.println(this.getName()+" Aparkat Saldirisi boşa gitti.");
            setMorale(getMorale()-1);
            return 0;
        }
        int base =20;
        int f = weight * acceleration;
        double damage = base + this.morale + f/10.0;
        if(isBlance()){
            return  (int) damage;
        }else{
            return  (int) (damage - base);
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
            return  (int) (damage - base);
        }
    }

    public boolean block(int attack){

        prepareDefance();
        if(attack<=0){
            return true;
        }
        if(attack>getHealth()){
            setHealth(0);
            return false;//game over. Fighter done..
        }
        if(isBlance() && isGuard() && isDistance()){
            System.out.println(getName()+" hasarı %75 azalttı. hasar:"+(attack-(attack*75/100)));
            attack = (attack-(attack*75/100));
            setHealth(getHealth()-attack);
        }
        else if(isBlance() && isGuard()){
            System.out.println(getName()+" hasarı %50 azalttı. hasar:"+(attack-(attack*50/100)));
            attack = (attack-(attack*50/100));
            setHealth(getHealth()-attack);
        }else if (isBlance() || isGuard()){
            System.out.println(getName()+" hasarı %25 azalttı. deger:"+(attack*25/100));
            System.out.println(getName()+" alınan hasar:"+(attack-(attack*25/100)));
            attack = (attack-(attack*25/100));
            setHealth(getHealth()-attack);
        }else{
            setMorale(getMorale()-(getMorale()/10));
            System.out.println(getName()+" tüm hasarı yedi. hasar:"+attack);
            setHealth(getHealth()-attack);
        }

        return true;
    }



    private void showHealt() {
        System.out.println("Saglik :"+this.getName()+"="+getHealth());
    }

    private boolean evasion(){
        if(getRandom010()>getRandom010() && getRandom010()<getRandom010()){
            if(getRandom010()>7){
                System.out.println(this.getName()+" saldırıdan sakıniyor.");
                setMorale(getMorale()+3);
                return true;
            }
        }
        return false;
    }

    public int getRandom010(){
        return (int) ((Math.random() * 10));
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
