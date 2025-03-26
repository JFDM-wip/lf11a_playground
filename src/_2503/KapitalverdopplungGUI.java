package _2503;

import javax.swing.*;

public class KapitalverdopplungGUI {
    public static void main(String[] args) {
        String eingabe, ausgabe;
        double startkapital, kapital, zinssatz;
        int jahre = 0;

        eingabe = JOptionPane.showInputDialog("Startkapital eingeben");
        startkapital = Double.parseDouble(eingabe); // "500.00"
        eingabe = JOptionPane.showInputDialog("Zinssatz eingeben");
        zinssatz = Double.parseDouble(eingabe);

        kapital = startkapital;

        do {
            kapital *= (1 + zinssatz/100);
            jahre++;
        } while (kapital < 2 * startkapital);

        // %d -> decimal Integer Werte
        // %,.2f -> float Werte, 2 steht für 2 Nachkommastellen
        ausgabe = String.format("Das Startkapital von %,.2f €"
                                + "\nhat sich nach %d Jahren verdoppelt."
                                + "\nEndkapital: %,2f €", startkapital, jahre, kapital);

        JOptionPane.showMessageDialog(null, ausgabe);
    }
}
