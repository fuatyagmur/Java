package practice_basic_day01;

public class Q05_EscapeSequences {
    public static void main(String[] args) {

        System.out.println("\'HELLO \', \'World \\/ \'" );
        System.out.println("\"HELLO\", \"World \\/ \"");

        //Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdiriniz.

        System.out.println("P");
        System.out.println("a");
        System.out.println("z");
        System.out.println("a");
        System.out.println("r");
        System.out.println("t");
        System.out.println("e");
        System.out.println("s");
        System.out.println("i\n");

        // ya da

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni\n");

        //'Java' ile hayat cok 'afilli' yazdiriniz.

        System.out.println("\"Java\" ile hayat cok \'afilli\'");

        // "Zaruret" insani
        //'kasif' yapar yazdiriniz.
        //sonraki "TechProEd ile Java cok kolay..." ifadesi 3 satir sonra ve satir basindan 1 tab ileride yazdiriniz.

        System.out.println("\"Zaruret\" insani\n\'kasif\' yapar.\n\n\n\t \"TechProEd ile Java cok kolay...");

        System.out.println("\\");

    }
}
