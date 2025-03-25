package _2403;

public class PrimitiveDatentypen {

    public static void main(String[] args) {

        // Variablen Deklaration und Initialisierung in einem Schritt
        boolean wahrheitswerte = true;

        // Nur Deklaration
        char charakter; // einzelne Zeichen z.B. 'c'
        // Nur Initialisierung
        charakter = 'a';

        byte kleineGanzeZahl; // werte von -128 bis 127
        short nichtsGanzSoKleineZahl; // werte von -32768 bis 32.767
        int ganzeZahl; // -2_147_483_648 bis 2_147_483_647
        long sehrGroßeGanzeZahl; // -9_223_372_036_854_775_808 bis -9_223_372_036_854_775_807

        float fließkommaZahl; // 1.4E-45 bis 3.4028235E+38
        double großeFließkommaZahl; // 4.9E-324 bis 1.7976931348623157E+308

        // String ist ein komplexer Datentyp (Klasse)
        String ersterString = "Hallo Welt";

        // Konventionen bei Bezeichnern
        // PascalCase für Klassen -> Erster Buchstabe Groß und jedes neue Wort wieder Groß
        // camelCase für Variablen- und Methodenbezeichner -> erster Buchstabe klein und jedes neue Wort Groß

    }
}
