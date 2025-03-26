package _2503;

import java.util.Scanner;

public class Kontrollstrukturen {
    public static void main(String[] args) {
        // Definition der Variablen a und b
//        int a, b;
//        // Anlegen eines Objekts vom Typ Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Bitte eine Ganzzahl für a eingeben: ");
//
//        // Einlesen eines int Wertes und Zuweisung zu a
//        a = scanner.nextInt();
//        if(a < 10) {
//            System.out.println("A ist kleiner als 10");
//        } else if (a > 10) {
//            System.out.println("A ist größer als 10");
//        }
//
//        // Einlesen eines int Wertes und Zuweisung zu b
//        System.out.print("Bitte eine Ganzzahl für b eingeben: ");
//        b = scanner.nextInt();
//
//        // if Verzweigung mit ternary operator (Konditional-Operator)
//        // der Operator ist das "?", links des ?-Operators steht der auszuwertende Ausdruck,
//        // rechts davon die möglichen Werte.
//        // Der erste Wert (hier "B ist kleiner als 10") wird zugewiesen, wenn der Ausdruck als true ausgewertet wird
//        // der zweite Wert, rechts des ":" wird zugewiesen, wenn der Ausdruck als false ausgewertet wird
//        String text = b < 10 ? "B ist kleiner als 10" : "B ist größer als 10";
//        System.out.println(text);


        // switch-Verzweigung
        String wochentag = "Freitag";
        switch (wochentag) {
            case "Montag":
                System.out.println("Es ist Montag");
                break;
            case "Dienstag":
                System.out.println("Es ist Dienstag");
                break;
            case "Mittwoch":
                System.out.println("Es ist Mittwoch");
                break;
            default:
                System.out.println("Es ist weder Montag, Dienstag noch Mittwoch");
            //...

        }
        // Verkürzte Syntax mit -> und ohne ausgeschriebene break Anweisung
        switch(wochentag) {
            case "Montag" -> System.out.println("Es ist Montag");
        }





    }


}
