package day14_stringManipulation;

public class C04_isimGizleme {
    public static void main(String[] args) {

         //kullanicidan ismini soyismini ve kredikarti bilgilerini isteyip asagidaki gibi
        // isim-soyisim: M***** B****
        // kart no: **** **** **** 1234

        String isim="Oguzhan";
        String soyisim="Balkaya";
        String kkNo="1234567890123456";

        String yeniisim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yenisoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        String yeniKkNo="**** **** ****"+ kkNo.substring(12);

        System.out.println("isim-soyisim: "+yeniisim+" "+yenisoyisim+"\nkart no: "+yeniKkNo);

    }
}
