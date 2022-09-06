package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=40;  //scanner scan  yerine sayiyi biz belirliyoruz onden

        String sonuc=sayi>=100 ? "sayi 3 basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        //ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun(ustteki durumda sonuc string old. Stringe atama yaptik)
        // bir variable'a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi: " + sonuc);

    }
}
