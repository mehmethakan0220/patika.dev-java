package SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee;
        String name;
        double maas;
        int haftalikCalisma;
        int baslangicYili;
        while (true){
            System.out.print("Adı\t:");
            name =scanner.nextLine();
            System.out.print("Maaşi\t:");
            maas = scanner.nextInt();
            System.out.print("Haftalık Çalışma Saati\t:");
            haftalikCalisma = scanner.nextInt();
            System.out.print("İşe Başlangıç Yılı\t:");
            baslangicYili = scanner.nextInt();
            employee = new Employee(name,maas,haftalikCalisma,baslangicYili);

            employee.to_String();

        }
    }
}
