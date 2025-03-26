package grundlagen;

public class Methoden {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int hierRueckgabeWertEinsetzen = addiere(a, b);
        System.out.println(hierRueckgabeWertEinsetzen);
        System.out.println(multipliziere(a, b)); // System.out.println(50);


    }

    // zugriffsmodifikator, dann static (weil Klassenmethode und keine Objektmethode),
    // rückgabewert und bezeichner plus parameterliste in klammern
    public static int addiere(int a, int b) {
        int summe = a + b;
        // return a + b;
        return summe;
    }
    public static int multipliziere(int a, int b) {
        return a * b;
    }

}
