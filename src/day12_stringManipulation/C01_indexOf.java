package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        //Kullanicidan bir kelime e bir cumle isteyin.kelimenin cumledeki kuullanimina bakarak
        //girilen kelime cumlede kullanilmamis
        //girilen kelime cumlede 1 kere kullanilmis
        //girilen kelime cumlede  1 den fazla kullanilmis

        String cumle="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkkullanim=cumle.indexOf(kelime);  // -1 veya index
        int ikincikullanim=cumle.indexOf(kelime,ilkkullanim+1);


        if (ilkkullanim==-1){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (ikincikullanim==(-1)){
            System.out.println("istenen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis");
        }




    }
}
