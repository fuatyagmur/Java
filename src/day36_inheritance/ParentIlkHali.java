package day36_inheritance;

public class ParentIlkHali {
    protected ParentIlkHali(){
        System.out.println("Parent parametresiz cons. calisti");
    }
    protected ParentIlkHali(int sayi3, int sayi4){
        System.out.println("Parent 2 parametreli cons");
    }
    protected int sayi;
}