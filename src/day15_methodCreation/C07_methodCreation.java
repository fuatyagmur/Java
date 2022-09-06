package day15_methodCreation;

public class C07_methodCreation {
    public static void main(String[] args) {

        String str="Ali";

        //Stringi yazdiran bir method olusturalim

      //  stringYazdir(str);

        //hosgeldiniz diyen bir method olusturun
        //hosgeldinYazdir();

        //kapanma mesaji yazan bir method olusturalim
        //kapanmaMethou();

        //ustteki methodlari yorum haline getirdik yoksa calisiyorlardi
        //3 methodu da bir methodun altina (hosgeldin yazdir) methodunun icine yazdik altta methodlarin altinda

        //hosgeldiniz diyen bir method olusturun
        hosgeldinYazdir();


    }

    public static void kapanmaMethou() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("boyle de olur");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethou();
    }
}
