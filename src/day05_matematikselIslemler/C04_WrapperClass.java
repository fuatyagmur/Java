package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="java";
        int sayi=10;

        System.out.println(str.toUpperCase());  //JAVA
        System.out.println(str);

        double sayi2=20.5;
        //sayi2 primitive old. sayi2. dedigimizde hicbir method gelmez.

        Double sayi3=12.5;
        //sayi3 wrapper class olan Double class'ini kullandigindan sayi3. dedigimizde bircok method gelir.

    }
}
