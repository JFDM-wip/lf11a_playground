package _2403;

public class EscapeSequenzen {
    public static void main(String[] args) {
        // Escapesequenzen sind spezielle Zeichen die aus dem normalen Textfluss in z.B. einem String ausgeklammert werden,
        // um ein Steuerzeichen zu setzen
        // z.B.:
        // \n als Zeilenumbruch
        // \b Backspace
        // \t Tabulator
        // \" für Anführungszeichen
        // \' für ein einfaches Anführungszeichen
        // \\ für einen Backslash
        System.out.println("Hier steht meine erste Zeile\nhier steht meine zweite Zeile\t dieser Teil ist eingerückt");
        System.out.println("Die dritte Zeile mit \"Anführungszeichen\"");
    }
}
