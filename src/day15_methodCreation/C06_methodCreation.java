package day15_methodCreation;

public class C06_methodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variablenin degerini toplayan bir method olusturalim
        //1. adim:  method adini yazalim
        //2.adim: methoda gondermem gereken arguman var mi? ( a,b)

        ikisayitopla(a,b);

        C04.dortharfitersinecevir("sema");


    }
    //bir methodu olusturmak calismasi icin yeterli degildir
    //method ancak cagrilirsa calisir
    //ayni class veya farkli class da olmasinin hic bir onemi yoktur
    //Java main method da yukaridan asagiya dogru calisir
    //ve geldigi satiri calistirir

    private static void ikisayitopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami: "+ (a+b));
    }
}
