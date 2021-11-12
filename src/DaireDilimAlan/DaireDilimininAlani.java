package DaireDilimAlan;

import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {

        double r,angle,area;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaricap giriniz (r)\t");
        r = scanner.nextDouble();
        System.out.println("Aciyi giriniz (x) \t");
        angle = scanner.nextDouble();

        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        area = (Math.PI*Math.pow(r,2) * angle)/360;
        System.out.println("Daire diliminin alani\t:"+area);

    }
}
