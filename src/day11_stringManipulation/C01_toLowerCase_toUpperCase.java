package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));  // guzeldir i 'buyuk i' ile yazdi (tr turkce)
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));  // fr fransizca

    }
}
