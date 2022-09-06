package day17_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        //10 ile 30 arasindaki ( 10 ve 30 dahil)
        //sayilari aralarinda virgul olarak yni satirda yazdirin

        for (int i = 10; i <= 30; i++) {
            System.out.print(i + " ,");

            //eger ustteki gibi yazarsak 30 dan sonra da virgul koyar

        }
        //ya da soyle yazabiliriz

        int baslangic = 10;
        int bitis = 30;

        for (int i = baslangic; i < bitis; i++) {

            if (i < bitis) {
                System.out.println(i + " ,");
            } else {
                System.out.println(i);

            }

        }
    }

}
