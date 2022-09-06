package day15_methodCreation;

import java.util.Scanner;

public class C03_methodCreation {
    public static void main(String[] args) {

        //kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa"yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve kelimenin tersten yazilisini yazdirin
        //eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.next();
        int harfsayisi=kelime.length();

        if (harfsayisi<3){
            System.out.println("kelime cok kisa");

        }else if (harfsayisi==3){
            ucharfitersinecevir(kelime);

        }else if (harfsayisi==4){
            dortharfitersinecevir(kelime);

        }else if (harfsayisi==5){
            besharfitersinecevir(kelime);

        }else {
            System.out.println("kelime cok uzun");

        }

    }

    //1. method olusturmak icin methodun adini yazariz
    //2. methoda giderken silmem gereken variable varsa , bunu methoda eklemeliyim

    private static void besharfitersinecevir(String kelime) {

       String terskelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi: "+kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    private static void dortharfitersinecevir(String kelime) {
       String terskelime=kelime.substring(3)+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi: "+kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    private static void ucharfitersinecevir(String kelime) {
        String terskelime =kelime.substring(2)+ kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi: "+kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);

    }



    
}
