package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str="  Siz ne derseniz deyin, Java bildigini okur  ";

        str.trim();
        System.out.println(str); //bosluklu calistirir cunku ustte atama yapmadik
        System.out.println(str.length());

        str=str.trim();
        System.out.println(str); //bosluksuz yazdirir
        System.out.println(str.length());

        str="ali okula git \ngit ali git";
        System.out.println(str.trim());

    }
}
