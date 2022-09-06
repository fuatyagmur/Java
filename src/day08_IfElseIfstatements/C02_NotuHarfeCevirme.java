package day08_IfElseIfstatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

        //kullanicidan 100 uzerinden notunu isteyin.
        // notu harf sistemine cevirip yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN NOTUNUZU GIRINIZ");

        double notsayi= scan.nextDouble();

        if (notsayi<0 || notsayi>100){
            System.out.println("gecersiz sayi");
        }

         else if (notsayi<50) {
            System.out.println("notunuz:D");
        }else if (notsayi>=50 && notsayi<60){
            System.out.println("notunuz:C");
        } else if (notsayi>=60 && notsayi<80){
            System.out.println("notunuz:B");
        } else{
            System.out.println("notunuz:A");
        }


    }
}
