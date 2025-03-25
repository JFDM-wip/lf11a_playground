package _2403;

public class Casting {
    public static void main(String[] args) {
        // _2403.Casting in Java:
        // Widening, also implizites _2403.Casting wendet Java an,
        // wenn vom kleineren Datentypen in einen größeren Datentypen gewechselt wird:
        byte kleineZahl = 5;
        int großeZahl = kleineZahl;
        // oder:
        int zweiteGroßeZahl = 50000;
        long sehrGroßeZahl = zweiteGroßeZahl;
        // char in int, hier wird der Wert des ASCII-Codes in den int Datentyp gelegt:
        int zeichenWert = 'A';


        // Narrowing, muss explizit angegeben werden:
        int großeZahl2 = 50000;
        byte kleineZahl2 = (byte)großeZahl2;

        float fließkommaZahl = 3.78F;
        int fließkommaZahlZuInteger = (int)fließkommaZahl;

    }
}
