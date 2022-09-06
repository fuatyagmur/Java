package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        //kullanicidan 4 basamakli bir sayi isteyin.
        // girdigi sayi 5 e bolunuyorsa son rakami kontrol edin.
        // son rakami 0 ise ekrana 5 e bolunen cift sayi yazdirin.
        // son rakami 0 degil ise 5 e bolunen tek sayi yazdirin.
        // girdigi pasword 5 e bolunmuyorsa "tekrar deneyin"yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {

            System.out.println("lutfen 4 basamakli pozitif bir tamsayi giriniz");

        } else if (sayi % 5 == 0) {

            if (sayi % 10 == 0) {
                System.out.println("5 e bolunebilen cift sayi");
            } else {
                System.out.println("5 e bolunebilen tek sayi");
            }

        }else{
                System.out.println("tekrar deneyin");

            }
        }
    }