package day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        //kullanicidan 100 den kucuk bir tamsayi isteyin.
        // 1 den baslayarak girilen sayiya kdr tum sayilari yazdirin. ancak;
        //sayi 3 un kati ise yerine "Java"yazdirin
        //sayi 5 in kati ise yerine "guzel" yazdirin
        //sayi hem 3 un hem 5 in kati ise yerine "Java Guzeldir" yazdirin

        int sayi=60;

        //for (int i = 1; i <=sayi ; i++) {
          //  if (i%3==0){
            //    System.out.print(" java");
           // }else if(i%5==0){
           //     System.out.print(" guzeldir");
           // }else if (i%3==0 && i%5==0){
             //   System.out.print(" java guzeldir");
            // }else {
               // System.out.print(i+" ");
            //}

        //}

        //ustteki gibi yazarsak 15. sayida "java guzeldir" yazmaz "java" yazar ustten asagiya kod mantigi
        //bu yuzden 15 ile baslamaliyiz


        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0  ){
                System.out.print(" java guzeldir");
            }else if( i%3==0 ){
                System.out.print(" java");
            }else if ( i%5==0){
                System.out.print(" guzeldir");
            }else {
                System.out.print(i+" ");
            }

        }



    }
}
