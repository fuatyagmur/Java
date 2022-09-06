package day08_IfElseIfstatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitif oldugundan toplamlari= " + (sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz iki sayi da negatif oldugundan carpimlari= " + (sayi1*sayi2));
        } else if (sayi1*sayi2<0){
            System.out.println("farkli isaretlerde sayilarla islem yapamazsiniz");
        } else {
            System.out.println("sifir carpmaya gore yutan elemandir.");}

    }
}
