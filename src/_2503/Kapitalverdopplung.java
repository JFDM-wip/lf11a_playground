package _2503;

import java.util.Scanner;

public class Kapitalverdopplung {
    public static void main(String[] args) {
        double startkapital, kapital, zinssatz;
        int jahre = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie den Wert für das Startkapital ein: ");
        startkapital = scanner.nextDouble();
        kapital = startkapital;

        System.out.print("Bitte geben Sie ihren Zinssatz ein: ");
        zinssatz = scanner.nextDouble();

        do {
            kapital *= (1 + zinssatz/100);
            jahre++;
        } while (kapital < 2 * startkapital);

        System.out.println(kapital);
        System.out.println("Kapitalverdopplung nach " + jahre + " Jahren");



    }
}
