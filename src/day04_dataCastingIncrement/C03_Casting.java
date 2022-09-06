package day04_dataCastingIncrement;

public class C03_Casting {
    public static void main(String[] args) {
        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2);

        sayi2=3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;             //478
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;              //47
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;              //4
        System.out.println(sayi1);

        sayi1=sayi1/sayi2;              //0
        System.out.println(sayi1);



        sayi1=5666;
        sayi2=10;

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2+4);

        sayi1=4895;
        double sayi3=10;

       // sayi1=sayi1/sayi3;

        System.out.println(sayi1/sayi3);
        System.out.println(sayi3/sayi1);

    }
}
