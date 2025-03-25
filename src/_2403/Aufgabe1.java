package _2403;

public class Aufgabe1 {
//    Übung 1
//    Schreibe eine Klasse mit einer main-Methode
//    Definiere darin für jeden primitiven Datentyp eine Variable und weise ihr einen passenden Wert zu.
//    Beachte bei der Benennung die Namenskonventionen und verwende sprechende Bezeichner.
//
//    Definiere zusätzlich zwei String Variablen (vorname und nachname).
//    Gebe anschließen diese variablen verknüpft in einer Zeile aus.
//
//    Übung 2
//    Recherchiere den Begriff Methode in Java
//    Schreibe anschließend 4 Methoden für die 4 Grundrechenarten und rufe sie in der main-Methode auf.

    public static void main(String[] args) {
        // Ganzzahlige-Typen
        byte kleinsteZahl = 1;
        short kleinereZahl = 100;
        int normaleZahl = 5_000_000;
        long großeZahl = 372_036_854_775_807L;
        System.out.println("Byte: " + kleinsteZahl + "\nShort: " + kleinereZahl + "\nInteger: " + normaleZahl + "\nLong: " + großeZahl);

        // Fließkomma-Typen
        float fließkommaZahl = 3.14f;
        double fließkommaZahlMitBessererPräzision = 3.141592653589793;
        System.out.println("Float: " + fließkommaZahl + "\nDouble: " + fließkommaZahlMitBessererPräzision);

        // Wahrheitswerte / Logischer-Datentyp
        boolean boolescherWert = true;
        System.out.println(boolescherWert);

        // Zeichen-Datentyp
        char einzelnesZeichen = 'b';
        System.out.println(einzelnesZeichen);

    }
}
