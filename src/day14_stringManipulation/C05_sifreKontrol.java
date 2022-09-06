package day14_stringManipulation;

public class C05_sifreKontrol {
    public static void main(String[] args) {

        //Kullanicidan bir seifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa "sifre basari ile tamamlandi".
        //sartlari saglamazsa "islem basarisiz, lutfen yeni bir sifre girin" yazdirin
        //ilk harf buyuk harf olmali
        //son harf kucuk harf olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakter olmali

        String sifre = "Aasdf12345a";

        boolean ilkHarf = false;

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarf = true;
        } else {
            System.out.println("Siftenizin ilk harfi buyuk harf olmali");
        }

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarf = true;
        } else {
            System.out.println("sifrenizin son harfi kucuk harf olmali");
        }

        boolean bosluk=false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk=false;

        if (sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("sifre uzunlugu en az 8 karakter icermelidir");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("Sifreniz basarili bir sekilde kaydedildi");
        }else{
            System.out.println("islem basarisiz lutfen yeni bir sifre giriniz");
        }
    }
}
