package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve hafta ici veya haftasonu oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismi yaziniz");
        String gunismi=scan.next().toLowerCase();  //kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz.

        //string ifadelerde == kullanilmasi tavsiye edilmez
        //cunku bekledigimizden farkli sonuc verebilir. Bu yuzden equals kullaniriz
        if (gunismi.equals("pazar") || gunismi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunismi.equals("pazartesi")||gunismi.equals("sali")||gunismi.equals("carsamba")||
                gunismi.equals("persembe")||gunismi.equals("cuma") ){
            System.out.println("girdiginiz gun haftaici");

            //SALI girdigimizde unlu unsuz harf farkindan dolayi calismiyor. Hocaya sor
        }

    }
}
