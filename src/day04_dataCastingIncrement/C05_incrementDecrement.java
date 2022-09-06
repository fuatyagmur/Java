package day04_dataCastingIncrement;

public class C05_incrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);  //30
        System.out.println(sayi);     //20

        sayi=sayi+10;
        System.out.println(sayi);     //30

        System.out.println(sayi=sayi+=10);   //40
        System.out.println(sayi);            //40

        //veya

        System.out.println(sayi+=10);
        System.out.println(sayi);

        System.out.println("21. satir: "+ sayi++); //50
        System.out.println("22.satir: "+ sayi);  //51

        System.out.println("24.satir: "+ ++sayi);  //52
        System.out.println("25.satir: "+ sayi);   //52


     }
}
