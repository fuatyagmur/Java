package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaji {
    public static void main(String[] args) {

        //kullanicidan istedigi kdr sayi girmesini isteyin
        //kullanicinin girdigi sayilarin toplami 500 u gecerse
        // artik yeter cok sayi girdin, toplam ... oldu yazsin

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;

        while (toplam<=500){
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("artik yeter cok sayi girdin, toplam: "+toplam+" oldu");

    }
}
