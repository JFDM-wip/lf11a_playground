package _2503;

import javax.swing.JOptionPane;

//Unterschied Präinkrement - Postinkrementpublic
class InkrementAufgabe {
    public static void main(String[] args) {
        int c;
        String ausgabe = "";

        // Postinkrement
        c = 5;
        // ausgabe = ausgabe + c + ", ";
        ausgabe += c + ", ";
        ausgabe += c++ + ", ";
        ausgabe += c + "\n";

        // Präinkrement
        c = 5;
        ausgabe += c + ", ";
        ausgabe += ++c + ", ";
        ausgabe += c;

        // Ausgabe
        System.out.println(ausgabe);
        JOptionPane.showMessageDialog(null, ausgabe, "prä- und postinkrement", JOptionPane.PLAIN_MESSAGE);
    }
}