package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary eki iki sonucun data turleri farkli olabilir

        //verilen sayi 100 den buyukse sayinin karesini alip yazdiran
        // 100 den kucukse "sayi 100 den buyuk olmali" yazdiran
        //bir ternary olusturalim

        int sayi=50;

        //ternary bie sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        //veya bir degiskene atamaliyiz
        // eger sonuclar farkli data turlerinde ise
        //atama yapacagimiz variablenin data turu tek olacagindan
        //atama yapamayiz
        //SADECE direk yazdirabiliriz
        // YANI SONUC olrk ya string ya da integer dan birinin gelmesini bekleyemeyiz. ya stringdir ya da int

      //  sayi>100 ? sayi*sayi  : "sayi 100 den buyuk olmali"  ====> ustteki aciklamanin ornegi

        System.out.println(        sayi>100 ? sayi*sayi  : "sayi 100 den buyuk olmali");

    }
}
