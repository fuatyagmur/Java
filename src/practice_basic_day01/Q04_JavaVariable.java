package practice_basic_day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {

        //Initializing variable  //variable baslangic degeri verme
        int age=32;
        int temp=52;   //temporary

        System.out.println(age);
        System.out.println("temp = " + temp);

        //To copy the variables value
        int myAge=33;
        int hisAge=myAge;

        //you can declare multiple variables in the same line
        int year=2022,  month=3,  day=2;    //tek satirda tum verileri girdik

        //updating a variable
        year=2032;     // int year; olrk yazsaydik kabul etmezdi cunku aynisi ustte tanimlanmisti.
                       //sadece year olrk yazinca var olan degeri degistirmis oluyoruz.

        //bir degisken tanimlayin: x
        // baska bir degiskeni initialize edin: y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x;
        int y=2000;
        x=123;
        y=234;

        System.out.println("x = " + x);
        System.out.println("y = " + y);




    }
}
