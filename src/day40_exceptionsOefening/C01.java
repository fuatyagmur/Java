package day40_exceptionsOefening;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        //kullanicidan iki sayi alip, boldurerek
        // sonucu yazdirin bir program yazdiriniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Bolmek istediginiz sayiyi yaziniz: ");
        int sayi1=scan.nextInt();


        System.out.println("Kaca bolmek istediginizi yaziniz: ");
        int sayi2= scan.nextInt();

        if (sayi2==0){
            System.out.println("Sayi/0 tanimsizdir.");
        } else {
            System.out.println("sonuc: " + sayi1 / sayi2);  //ArithmeticException: / by zero
        }



    }
}
