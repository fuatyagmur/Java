package day11_stringManipulation;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {

         String str1="Java bir baska guzel valla cok guzel";

         //istersek char olrk verdigimiz bir harfin indexini bize dondurur
         System.out.println(str1.indexOf('J')); //0

        //istersek bir harf veya metin olrk verdigimiz Stringin indexini bize verir
        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1); //35
        System.out.println(str1.indexOf("aska")); //10 baslangic indexi

        //ayni harften birden fazla varsa
        System.out.println(str1.indexOf("b"));  //5 buldugu ilk dogru eslesmenin indexini dondurur

        System.out.println(str1.indexOf('b',5 ));
        // bu methodda java aramaya from index olan indexten baslar. yani 5. indexten baslar

        //verilen stringdeki 2. a harfinin indexini bulalim.
        int ilkindex=str1.indexOf('a');  //1
        System.out.println(str1.indexOf('a',ilkindex+1));  // 3

        //verilen stringdeki 2. b harfinin indexini bulalim.
        int ilkbindex=str1.indexOf("b");  //5
        System.out.println(str1.indexOf("b",ilkbindex+1));  //9

        System.out.println(str1.indexOf("guzel"));  //15
        //20.indexten sonra guzel aratalim
        System.out.println(str1.indexOf("guzel",20));  //31




        //Stringde olmayan bir harf aratsak
        System.out.println(str1.indexOf("y"));  //-1
        //yok demenin sayisal karsiligi olrk java -1 dondurmeyi terih etmistir

        //kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        //iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail= scan.next();

         if (mail.indexOf('@')==-1){
             System.out.println("gecersiz mail adresi");
         }else{
             System.out.println("mailiniz kabul edildi");
         }

         //OZET: indexOf methodu icerirse yazilan string veya charin
        // metinde hangi indexde oldugunu bize dondurur
        //eger aradigimiz etin veya char yoksa , olmadiginin delili olrk
        // bize -1 dondurur.


    }
}
