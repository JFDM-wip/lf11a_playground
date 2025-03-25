package _2403;

public class Operatoren {
    public static void main(String[] args) {
        // Arithmetische-_2403.Operatoren
        // +, -, /, *, %, ()
        System.out.println(5 + 5); // 10
        System.out.println(5 - 5); // 0
        System.out.println(5 / 5); // 1
        System.out.println(5 * 5); // 25
        System.out.println(7 % 5); // 2

        // Zuweisungsoperator
        // kombinierte Zuweisungsoperatoren
        // +=, -=, /=, *=, %=
        int kleineZahl = 5;
        // kleineZahl = kleineZahl + 5;
        kleineZahl += 5;

        // Überladener Operator +
        // mit dem + Operator können nicht nur arithmetische Operationen durchgeführt werden,
        // er kann auch zur konkatenation von Zeichenketten genutzt werden
        String text1 = "Hello ";
        String text2 = "World!";
        String text3 = text1 + text2;
        System.out.println(text3); // Hello World!
    }
}
