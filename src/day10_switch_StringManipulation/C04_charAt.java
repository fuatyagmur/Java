package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        String str="Java Cok Guzel";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));

        System.out.println(""+str.charAt(2)+str.charAt(3 ));  //""sebebi chari string yazdirmak icin
                                                               // hiclik ifadesi koyup sayisal durumdan cikarmak gerekir

        //cOK yazdiralim

        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        //son harfi yazdir

        System.out.println(str.charAt(14-1));   //14-1

    }
}
