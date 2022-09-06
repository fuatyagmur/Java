package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz:");
        //String kullaniciIsmi=scan.next();
       // System.out.println("Kullanicinin girdigi isim: "+ kullaniciIsmi);

        String kullaniciIsmi= scan.nextLine();
        System.out.println("Kullanicinin girdigi isim: "+ kullaniciIsmi);
    }
    }

