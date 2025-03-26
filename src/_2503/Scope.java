package _2503;

public class Scope {
    // Gültigkeitsbereich innerhalb der Klasse
    static int test = 100;
    public static void main(String[] args) {
        // Gültigkeitsbereich innerhalb der main-Methode
        System.out.println(test);
        int a1, b1;
        int ergebnis;
        a1 = 5;
        b1 = 10;
        ergebnis = addiere(a1, b1);
        System.out.println("Ergebnis: " + ergebnis);
//        System.out.println(ergebnis);

    }

    public static int addiere(int a, int b) {
        int summe = a + b;
        return summe;
    }
}
