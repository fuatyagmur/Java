package day40_exceptionsOefening;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        //Kullanicidan istedigi kdr ayiyi alip toplayan bir program yaziniz.
        //Toplam 500'u gecerse programi bitirsin veya
        //Kullanici bitirmek istediginde Q'ya basmalidir.

        Scanner scanner=new Scanner(System.in);
        int toplam=0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz\n bitirmek icin Q ya basiniz");
            int sayi= 0;

            try {
                sayi = scanner.nextInt();
            } catch (Exception e) {

                e.printStackTrace();
            }


            toplam+=sayi;

        }while (toplam<500);





    }
}
