package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {

        //kullanicidan bir string isteyin
        //kullanicinin girdigi stringin palindrome olup olmadigini kontrol eden bir method olusturun

        String input="Java";
        palindromeKontrolEt(input);



    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);

        }

        System.out.println("Girdiginiz kelimenin tersten yazilisi :"+ terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz kelime Palinrome");
        }else {
            System.out.println("Girdiginiz kelime Palindrome degil");
        }
    }
}
