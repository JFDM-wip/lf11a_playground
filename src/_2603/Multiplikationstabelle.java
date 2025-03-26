package _2603;

public class Multiplikationstabelle {
    public static void main(String[] args) {
        /* Aufgabe:
            Erstelle eine Multiplikationstabelle mithilfe von Schleifen und Arrays, von 1 - 10

                       1   2   3   4   5   6   7   8   9  10
                       2   4   6   8  10  12  14  16  18  20
                       3   6   9  12  15  18  21  24  27  30
                       4   8  12  16  20  24  28  32  36  40
                       5  10  15  20  25  30  35  40  45  50
                       6  12  18  24  30  36  42  48  54  60
                       7  14  21  28  35  42  49  56  63  70
                       8  16  24  32  40  48  56  64  72  80
                       9  18  27  36  45  54  63  72  81  90
                      10  20  30  40  50  60  70  80  90 100
        */

        // Zeilen
        int hoehe = 10;
        // Spalten
        int breite = 10;

        // leere "Tabelle" anlegen mit hoehe und breite
        int[][] tabelle = new int[hoehe][breite];

        // Die Tabelle mit Werten füllen.
        // Die erste Schleife bezieht sich auf die "Zeile",
        // die zweite auf die "Spalte"
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle.length; j++) {
                tabelle[i][j] = (i + 1) * (j + 1);
            }
        }

        // Ausgabe Zeilenweise um eine Tabelle zu erzeugen
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle.length; j++) {
                // printf bietet sich hier an,
                // um mit %4d den Text übersichtlich auszugeben
                System.out.printf("%4d",tabelle[i][j]);
            }
            // Zeilenumbruch, um in der nächsten Zeile die neue Ausgabe zu starten
            System.out.println();
        }
    }
}
