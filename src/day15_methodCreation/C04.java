package day15_methodCreation;

public class C04 {

    //main method olmadan da bir class olusturulabilir ancak
    //bu class direk calismaz
    //sadece depo gorevi gorur
    //baska classlardan kullanilabilecek method veya variablelari barindirir

    public static void besharfitersinecevir(String kelime) {

        String terskelime=kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi: "+kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    public static void dortharfitersinecevir(String kelime) {
        String terskelime=kelime.substring(3)+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi: "+kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    public static void ucharfitersinecevir(String kelime) {
        String terskelime =kelime.substring(2)+ kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayisi: "+kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);

    }





}
