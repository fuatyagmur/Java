package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen iki string'deki sayilari toplayin

        System.out.println(str1+str2); //1234523456

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //35801

        //Integer.valueOf(str1) methodu sdc sayisal deger iceren Stringlerde kullanilir.
        //Bir tane bile sayi disinda karakter olursa Java hata verir.


    }
}
