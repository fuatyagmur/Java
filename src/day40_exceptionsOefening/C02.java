package day40_exceptionsOefening;

public class C02 {
    public static void main(String[] args) {

        //String olarak verilen bir sayiyi
        // integer'a cevirip 2 katini ekranda yazdiralim

        String str="12345";

        int sayi=Integer.parseInt(str);

        System.out.println("Girilen sayinin 2 kati: "+ sayi*2);


        String str2="1234a";



        //System.out.println("Girilen sayinin 2 kati: "+sayi2*2); //NumberFormatException: For input string: "1234a"

        try {
            int sayi2=Integer.valueOf(str2);
            System.out.println("Girilen sayinin 2 kati: "+sayi2*2);

        } catch (Exception e) {
            System.out.println("Girdiginiz string sayi olmayan elementler iceriyor.");
           // e.printStackTrace();
        }

    }
}
