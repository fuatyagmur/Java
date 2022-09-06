package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Length {
    public static void main(String[] args) {

        //Kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim=scan.nextLine();

        System.out.println("ilkharf :"+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("sonharf :"+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());  //0

        String str2=null;
        System.out.println(str2);
        System.out.println(str2.length());  // calistirildiginda hata verir

        String str3;
        //System.out.println(str3);

        //str3 ve str2 ye deger atanmamistir.
        // str2 null pointer ile isaretlendiginden java durumun kontrol altinda oldugunu bilir
        //ve geriye kalan kodun calismasina engel olmaz
        //ancak str3 e bir deger atamasi olmayinca java altini kirmizi cizer
        //ve bu durum duzeltilinceye kdr kodun geriye kalaninin calismasina izin vermez




    }
}
