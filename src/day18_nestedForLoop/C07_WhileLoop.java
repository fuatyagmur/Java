package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan kac dayi toplamak istedigini alin
        //bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        int sayiAdededi=5;

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdededi ; i++) {

            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("Girilen "+sayiAdededi+ " sayinin toplami: "+toplam);


        //while ile yapalim

        sayi=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayiAdededi){

            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println("Girilen "+sayiAdededi+ " sayinin toplami: "+toplam);


    }
}
