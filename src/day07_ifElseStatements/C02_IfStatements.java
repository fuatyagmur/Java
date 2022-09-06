package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b && b<100){
            System.out.println("isteginiz gerceklesecek.");
            System.out.println("body icindeki tum kodlar calisir");}


        if (a>0) System.out.println("suslu parantez olmzsa sadece bir satir calisir");
        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body'sini {} icine yazmalisiniz
        //body'yi {} icine yazmassak da if cumlesi calisir,
        //ancak ilk ; gordugunde if cumlesi bitmis olur.


        //22. satirdaki kod 15. satirdaki if dogru olsa da calisir false olsa da calisir.
        System.out.println("ikinci satir calisti");
    }
}
