package day40_exceptionsOefening;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int kontrol=0;

        while(kontrol!=2){

            System.out.println("Bolmek istediginiz sayiyi giriniz: ");
            int sayi1= scan.nextInt();

            System.out.println("Kaca bolmek istediginizi yaziniz: ");
            int sayi2=scan.nextInt();


            try {
                System.out.println("Sonuc = "+ sayi1/sayi2);
            } catch (Exception e) {
                System.out.println("Girdiginiz sayi da sorun var.");
              //  e.printStackTrace();
            }

            System.out.println("Devam etmek icin 1\n bitirmek icin 2'ye basiniz.");
            kontrol= scan.nextInt();


        }

    }
}
