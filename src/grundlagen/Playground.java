package grundlagen;
// import Anweisungen über der Klasse

import java.util.Arrays;

public class Playground {
    public static void main(String[] args) {
        // Einzeiliger Kommentar
        /*
        Mehrzeiliger Kommentar
         */
        // camelCase
        /**
         * DocKommentar
         */
        // Array anlegen über new Konstruktor
        int[] intArray = new int[10]; /* kommentar */
        // Array mit direkter Wertzuweisung ohne new
        int[] zweitesArray = {2, 4, 6, 1, 8};
        // kleinesArray[4]{0,0,0,0,0,0,0,0,0,0}
        int zahl = 10;
        // Konstante mit dem Keyword final
        final double DANN_SCHREIBE_ICH_SO = 3.14;

        // neue Wertzuweisung ist nicht möglich
        // DANN_SCHREIBE_ICH_SO = 5.0;

        System.out.println(Arrays.toString(intArray));

        // Wertzuweisung in einem Array
        for (int i = 0; i <= intArray.length - 1; i++) {
            intArray[i] = i + 10;
        }
        intArray[4] = 0;
        System.out.println(Arrays.toString(intArray));
    }
}
