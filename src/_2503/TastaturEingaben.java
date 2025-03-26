package _2503;


import java.util.Scanner;

public class TastaturEingaben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        System.out.println("Die Eingabe war: " + eingabe);
        double fließkommaEingabe = scanner.nextDouble();
        System.out.println("Fließkommazahl: " + fließkommaEingabe);

    }
}
