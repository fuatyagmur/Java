package day05_matematikselIslemler;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi);  //11

        sayi++;
        System.out.println("preincrementten once"+ sayi);   //12

        System.out.println( "preincrement satirinda"+ ++sayi);  //13
        System.out.println("preincrementten sonra"+ sayi);     //13


        System.out.println("postincrement satirinda"+ sayi++);  //13 once yazdir sonra artir
        System.out.println("postincrement satirindan sonra"+ sayi);  //14
    }
}
