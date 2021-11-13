package PasswordChecker;

import java.util.Objects;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String defaultPassword = "safak";
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Parola!\t:");
        input = scanner.nextLine();
        if(Objects.equals(input, defaultPassword)){
            System.out.println("Oturum Acildi!");
        }else{
            System.out.println("Hatali Parola");
            String yesNo;
            System.out.print("Parolanizi sifirlamak ister misiniz Evet icin 'E', Hayir icin 'H''ye basin!");
            yesNo = scanner.nextLine();
            switch (yesNo){
                case "E":
                    String newPass;
                    System.out.print("Yeni Parolayi Giriniz\t:");
                    newPass = scanner.nextLine();
                    if(Objects.equals(newPass, defaultPassword)){
                        System.out.println("Sifre olusturulamadi. Lutfen baska sifre giriniz.!");
                    }else if (Objects.equals(newPass, input)){
                        System.out.println("Sifre olusturulamadi. Lutfen baska sifre giriniz.!");
                    }else if (Objects.equals(newPass, "")){
                        System.out.println("Parola bos gecilemez!");
                    }else{
                        System.out.println("Parola olusturuldu! Yeni Parola\t:"+newPass);
                    }
                    break;
                case "H":
                    System.out.println("Iyi gunler dileriz.!");
                    break;
                default:
                    System.out.println("Buyuk Harf Kullanmalisiniz. E veya H");
            }
        }
    }
}
