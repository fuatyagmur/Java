package day06_concatenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);   //false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8;
                     //   T       T      T         T
        System.out.println(sonuc1);  //true

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8;
                    //   T      F     T           T
        System.out.println(sonuc2);   //false

        boolean sonuc3= 5>4 &7<9 & 6+3==9 & 5+2!=8;   //false

        //&& ve & arasindaki fark  && false'u gordumu durur devamindaki islemleri yapmaz. & tum islemleri yapar daha fazla zamana ihtiyac duyar.

        //sayi 3 un 10 ile 20 araliginda oldugunu true diyerek dondurelim.

        int sayi3=15;
        System.out.println(10<sayi3 &&  sayi3<20);  //true

        //sayi 4'un 10 ile 15 arasinda olmadigini true diyerek dondurelim.
        int sayi4=5;
        System.out.println(sayi4<10 || sayi4>15);
    }
}
