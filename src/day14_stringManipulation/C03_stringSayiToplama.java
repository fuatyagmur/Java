package day14_stringManipulation;

public class C03_stringSayiToplama {
    public static void main(String[] args) {

        //String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        //String str1="$13.99"
        //String str2="$10.55"
        //ipucu: Double.parseDouble() methodunu kullanabilirsiniz

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        System.out.println(str1+str2);  //13991055 olur

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);


        double sonuc=(str1Sayi+str2Sayi)/100;
        System.out.println("Verilen string sayilarin toplami: $"+ sonuc);

        //veya

        double str1Sayii=Double.parseDouble(str1);
        double str2Sayii=Double.parseDouble(str2);

        double sonucc=(str1Sayi+str2Sayi)/100;
        System.out.println("Verilen string sayilarin toplami: $"+ sonuc);


    }
}
