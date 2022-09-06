package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi isteyin ve sayinin tek veya cift ldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift sayidir");}

        if (sayi%2 !=0){
            System.out.println("girilen sayi tek sayidir.");

            //=======normalde bir sayi ya tektir ya da cifttir. ucuncu bir durum yoktur.
            //======= if else ile cozum========

            if (sayi%2==0){
                System.out.println("girdiginiz sayi cifttir");}
            else{
                System.out.println("girdiginiz sayi tektir");
            }
        }
    }
}
