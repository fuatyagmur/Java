package day06_concatenation_Operators;

import java.awt.datatransfer.StringSelection;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //variable'larin degerlerini degistirmeden asagidaki ifadeleri bu variable'leri kullanarak yazdirin.

        //Java5Guzel
        System.out.println(str1+sayi1+str2);

        //2Guzel15
        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));  //veya
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //Java22

        //53Guzel
        System.out.println(sayi1+(sayi2+str2));      //***
        System.out.println(""+sayi1+sayi2+str2);     //***

        //Eger tamamen sayilardan olusan bir string varsa ve biz bunu integer a cevirmek istersek Integer.valueof(str)
        // Bir sayiyi string'e cevirmek istersem  ""+sayi



    }
}
