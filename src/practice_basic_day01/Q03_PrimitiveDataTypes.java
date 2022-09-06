package practice_basic_day01;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {

        //byte,short,integer,long,double,float veri tiplerinin max en min value degerlerini yazdiriniz

        byte byteMax=Byte.MAX_VALUE;
        System.out.println(byteMax);
        byte byteMin=Byte.MIN_VALUE;
        System.out.println(byteMin);
        
        //soutv kisayolu ( alttaki ornekte soutv yazarsak ustundeki bilgiyi hazir aciklamali olrk getiriyor.)
        
        short shortMax=Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        int intMax=Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);
        int intMin=Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        long longMax=Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);
        long longMin=Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);

        double doubleMax=Double.MAX_VALUE;
        System.out.println("doubleMax = " + doubleMax);
        double doubleMin=Double.MIN_VALUE;
        System.out.println("doubleMin = " + doubleMin);

        float floatMax=Float.MAX_VALUE;
        System.out.println("floatMax = " + floatMax);
        float floatMin=Float.MIN_VALUE;
        System.out.println("floatMin = " + floatMin);



        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float,double,char,boolean)
        //Degiskenler icin anlamli isimler kullanip yazdiralim.


        float laptopFiyat=9999.99F;     //float sonu "f" ile biter
        float laptopNewFiyat=8459.43f;
        double kilometre=102.4;         // virgullu sayilar
        char harf='s';                  // tek karakter tek parantez icinde
        char cinsiyet='e';
        boolean dogruMu=true;           //true of false olck sekildi yazilir. onaylama operatorudur.
        boolean yanlisMi=false;



        System.out.println(laptopFiyat);                      //sout ile
        System.out.println("laptopFiyat = " + laptopFiyat);  //soutv ile kisayol
        System.out.println(kilometre);
        System.out.println("kilometre = " + kilometre);
        System.out.println(harf);
        System.out.println("harf = " + harf);
        System.out.println(dogruMu);
        System.out.println("dogruMu = " + dogruMu);


        System.out.println(laptopFiyat+" "+kilometre+" "+harf+" "+dogruMu);  //yan yana yazar ve toplamaz aradaki boslukdan dolayi
        System.out.println(laptopFiyat+"\n"+kilometre+"\n"+harf+"\n"+dogruMu); //alt alta yazar

        //  alt+mouse basili alta surukleme bircok satiri ayni anda yoruma almayi saglar.
        // ya da /* yapip bitmesini istedigin yere de /* yaparsak aradaki her seyi yoruma alir







    }
}
