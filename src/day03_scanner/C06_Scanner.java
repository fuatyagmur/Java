package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz: ");
        String isim= scan.nextLine();
        System.out.println("Lutfen soy isminizi giriniz: ");
        String soyisim= scan.nextLine();

        System.out.println("isim-soyisim: " +isim+ " "+soyisim );

        System.out.println("Lutfen isminizi yaziniz: ");
        String voornaam= scan.nextLine();
        System.out.println("Lutfen soy isminizi yaziniz: ");
        String achternaam= scan.nextLine();

        System.out.println("voornaam: "+ voornaam);
        System.out.println("achternaam: "+ achternaam);
        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz.");




    }
}
