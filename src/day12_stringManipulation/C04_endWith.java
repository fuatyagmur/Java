package day12_stringManipulation;

public class C04_endWith {
    public static void main(String[] args) {

        //kullanicidan email adresini girmesini isteyin
        //mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa "e mail adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdirin

        String email="mulkiyeayboy@gmail.com.tr";
        String arananmetin="@gmail.com";

        if (!email.contains(arananmetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.endsWith(arananmetin)){
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}
