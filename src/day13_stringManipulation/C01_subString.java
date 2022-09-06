package day13_stringManipulation;

public class C01_subString {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));  //ile IT cok guzel  5. index den sonrasini yazdiracak

        //yukaridaki stringi mehmet hoca ile IT cok guzel olrk yazdiralim

        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca  "+ str.substring(5));

        System.out.println(str.substring(9)); // IT cok guzel


        //eger bir indexten sona kdr olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring(baslangicindexi,bitisindexi)
        //baslangic indexi===>inclusive/dahil
        //bitis indexi===>exclusive/haric
        System.out.println(str.substring(0,5)); //Java

        System.out.println(str.substring(0,1)); //J

        //bana 6.karakter string olrk bulun
        String harf=str.substring(5,6); //i
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); //hiclik dondurur "" yani 7. karakteri dahil etmez

       // System.out.println(str.substring(5,2)); //bitis indexi baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));//son harfi verir   "r"
        System.out.println(str.substring(str.length()-5)); //son 5 harfi yazdiralim
        System.out.println(str.substring(str.length())); // son harften sonraki kismi yani hiclik verir




    }
}
