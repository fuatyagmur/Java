package day04_dataCastingIncrement;

import java.util.Scanner;

class C01_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ...");
        char ilkharf=scan.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi: "+ilkharf);

        System.out.println("Lutfen isminizi giriniz:...");
        char ikinciharf=scan.next().charAt(1);
        System.out.println("Girdiginiz ismin ikinci harfi: "+ikinciharf);

        System.out.println("Lutfen isminizi giriniz:...");
        char ucuncuharf=scan.next().charAt(2);
        System.out.println("Girdiginiz ismin ucuncu harfi: "+ucuncuharf);

    }
}
