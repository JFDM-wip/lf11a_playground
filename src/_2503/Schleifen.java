package _2503;

public class Schleifen {
    public static void main(String[] args) {
        int a = 10;

        while(a >= 10) {
            System.out.println("A hat den Wert: " + a);
            a--;
        }

        // (hier wird eine Laufvariable deklariert und initialisiert; hier wird die Bedingung geprüft; hier wird die Laufvariable NACH einem Schleifendurchlauf verändert)
        for (int i = 0; i < a; i++) {
            System.out.println("I hat den Wert: " + i);
        }

        int[] zahlen = {10, 20, 30, 40};

        for (int zahl : zahlen) {
            System.out.println("Der aktuelle Wert von Zahl: " + zahl);
        }

        for (int j = 0; j < zahlen.length; j++) {
            System.out.println("Mit der normalen For-Schleife: " + zahlen[j]);
        }

        int b = 10;
        do {
            System.out.println("Das hier wird auf jeden Fall ausgegeben");
        } while (b == 11);




    }
}
