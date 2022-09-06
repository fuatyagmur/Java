package day14_stringManipulation;

public class C02_terstenYazdirma {
    public static void main(String[] args) {

        //kullanicidan dort harfli bir kelime isteyin ve
        //girilen kelimeyi ilk harfi buyuk, digerleri kucuk olrk tersten yazdirin

        String input="Mavi";
        String tersStr=input.substring(3).toUpperCase()+
                       input.substring(2,3).toLowerCase()+
                       input.substring(1,2).toLowerCase()+
                       input.substring(0,1).toLowerCase();

        System.out.println(tersStr);

    }
}
