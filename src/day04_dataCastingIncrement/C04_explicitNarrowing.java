package day04_dataCastingIncrement;

public class C04_explicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);

        //int sayi4= sayi1/sayi2; //kabul etmez cunku deger double,variable int yani variable daha dar dolayisiyla java bunu otomatik olrk yapmaz sorumlulugu kabul etmeni ister.

        int sayi4=(int)(sayi1/sayi2);//sag tarafa yazdigimiz (int) sorumluluk bende demek
        System.out.println(sayi4);

        //veya

        int sayi5=sayi1/(int)sayi2;
        System.out.println(sayi5);

        int sayi6=140;
        byte sayi7=(byte) sayi6;
        System.out.println(sayi7);

        sayi6=129;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

        sayi6=520;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

    }
}
