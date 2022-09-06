package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        //kullanicidan 100 den kucuk bir tamsayi isteyin
        // 1 den baslayarak girilen sayiya kdr 3 un kati olan sayilari yazdirin

        int sayi=55;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%3==0){
                System.out.print(i+" ");
            }   //else ihtiyac olmadigi icin yazmadik

        }

    }
}
