package _2703;

public class Bruch {
    private int zaehler; // Objektvariable
    private int nenner; // Objektvariable
    private static int anzahlBrueche = 0;

    // leerer Konstruktor,
    // wenn nicht selbst geschrieben von Java als default-Konstruktor zur verfügung gestellt
    public Bruch() {
        this(0, 1);
    }

    // Konstruktor mit einem Parameter, hier die Variable zaehler vom Datentyp int
    public Bruch(int zaehler) {
        this(zaehler, 1);
    }

    // Konstruktor mit zwei Parametern, für sowohl zaehler als auch nenner
    public Bruch(int zaehler, int nenner) {
        anzahlBrueche++;
        this.zaehler = zaehler;
        // über dein if-else kann verhindert werden, dass nicht valide Werte übergeben werden
        if (nenner != 0) {
            this.nenner = nenner;
        } else {
            this.nenner = 1;
        }
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    // Methode ohne Rückgabewert -> void
    public void ausgeben() {
        System.out.println("Zähler: " + zaehler + " Nenner: " + nenner);
    }

    public void erweitern(int faktor) {
        zaehler *= faktor;
        nenner *= faktor;
    }

    public void kuerzen() {
        int t = ggT(zaehler, nenner);
        zaehler /= t;
        nenner /= t;
    }

    public static int ggT(int m, int n) {
        // r = 7 % 5; -> r = 2
        int r = m % n;
        while(r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }

    public static int getAnzahlBrueche() {
        return anzahlBrueche;
    }


    // Override ist eine optionale Annotation
    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }

}
