package SalaryCalculator;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(double salary){
        if(salary>1000){
            return salary*3/100;
        }
        return 0;
    }
    public double bonus(int workHours){
        if(workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }
    public double raiseSalary(int hireYear,int activeYear){
        if(hireYear>activeYear){
            return 0;
        }
        int yearResult = activeYear-hireYear;
        if(yearResult<10){
            return (getSalary()*5/100);
        }else if(yearResult>9 && yearResult<20){
            return (getSalary()*10/100);
        }else if (yearResult>19){
            return (getSalary()*15/100);
        }else{
            //do nothing
            return 0;
        }
    }
    public void to_String(){
        double tax = tax(getSalary());
        double bonus = bonus(getWorkHours());
        double raiseSalary = raiseSalary(getHireYear(),2021);
        System.out.println("Vergi\t:"+tax);
        System.out.println("Bonus\t:"+ bonus);
        setSalary(getSalary()-tax);
        setSalary(getSalary()+bonus);
        System.out.println("Vergi ve Bonuslar ile birlikte maas\t:"+getSalary());
        System.out.println("Maas Artisi\t:"+raiseSalary);
        setSalary(getSalary()+raiseSalary);
        System.out.println("Toplam Maaş\t:"+getSalary());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
