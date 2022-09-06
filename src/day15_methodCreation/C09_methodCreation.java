package day15_methodCreation;

public class C09_methodCreation {
    public static void main(String[] args) {

        String isim="Oguzhan";
        String soyisim="Balkaya";
        String kkNo="1234567890123456";

        //eger bir methoddan birsey yapmasini ve
        //yaptigi islemi bize getirmesini isterseniz
        //return type void degil, bize getirecegi sonucun data turunde olmalidir

       String gizlenmisIsimSoyisim=isimsoyisimgizle(isim,soyisim);
        System.out.println(gizlenmisIsimSoyisim);
        //bana isim soyismin gizlenmis halini getirmesini istiyorum
        //bekledigim donus string olur
       String gizlenmiskKno= krediKartiGizle(kkNo);
        System.out.println(gizlenmiskKno);



    }

    public static String krediKartiGizle(String kkNo) {
        String yeniKkNo="**** **** ****"+ kkNo.substring(12);
        return yeniKkNo;

    }

    public static String isimsoyisimgizle(String isim, String soyisim) {
        String yeniisim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yenisoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        //method olusturmada 3.adim
        //method calisinca sdc birsey mi yazdiricak
        //ya da bize bir data mi dondurecek buna karar vermektir.
        //bu soruda gizlenmis isimsoyisim dondurmesi istendiginden
        //return type i void degil string sectik
        //ve methodun sonuna return edilecek datayi yazdik
        return yeniisim+" "+ yenisoyisim;
    }
}
