package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //kullanicidan 10 dan kucuk bir tamsayi isteyin ve girilen sayinin faktoriyelini bulun.

        int input=9;
        int faktoryel=1;
        String faktoryelacikyazilim="";

        for (int i = input; i >=1 ; i--) {
            faktoryel*=i;
            if (i==input){
                faktoryelacikyazilim= faktoryelacikyazilim+i;
            }else {
                faktoryelacikyazilim=faktoryelacikyazilim+"*"+i;
            }

        }
        System.out.println(input+"!= :"+faktoryelacikyazilim+" ="+faktoryel);

    }
}
