package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        //Bu cumlede bosluk disindaki karakter sayisini bulunuz.
        System.out.println("space haric karakter sayisi: "+ str.replace(" ","").length());  //

        //atama yapilmadigi surece orjinal string kalici olrk degismez
        //adece o satir icin degisiklik yapilip sonuc yazdirilmis olur.

        System.out.println("orijinal str karakter sayisi: "+ str.length());


        //str da kalici degisiklik yapalim.
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalici degisiklikten sonra str: "+ str);

        str=str.replace("ne cok","ne az");
        System.out.println(str);

    }
}
