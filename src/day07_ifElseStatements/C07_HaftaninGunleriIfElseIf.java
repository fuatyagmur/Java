package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve hafta ici veya haftasonu oldugunu yazdirin.
        // eger kullanici gun ismini girerse "yanlis giris" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismini yaziniz");
        String gunismi=scan.next().toLowerCase();

        //hatali girisleri de yazdirmak icin olasiliklar 3 e cikardim
        // hafta sonu- hafta ici- yanlis giris

        if (gunismi.equals("pazar") || gunismi.equals("cumartesi")){
            System.out.println("girdiginiz gun hafta sonu");
        }
        else if (gunismi.equals("pazartesi")||gunismi.equals("sali")||gunismi.equals("carsamba")||
                gunismi.equals("persembe")||gunismi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");
        }
        else{
            System.out.println("lutfen gecerli bir gun ismi giriniz");
        }

    }
}
