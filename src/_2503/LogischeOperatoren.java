package _2503;

public class LogischeOperatoren {
    public static void main(String[] args) {
        // logische Operatoren
        boolean a = true;
        boolean b = false;

        // logisches Und &
        boolean wahrheitswert = a & b;
        System.out.println("Wahrheitswert: " + wahrheitswert); // false
        // logisches Oder
        wahrheitswert = a | b;
        System.out.println("Wahrheitswert mit logischem Oder: " + wahrheitswert); // true
        // logisches Xor ^ exklusives Oder -> hier müssen beide Operanden unterschiedliche Werte haben,
        // um zu einem true ausgewertet zu werden
        wahrheitswert = a ^ true;
        System.out.println("Exklusives Oder, ^ - Operator: " + wahrheitswert); // hier false

        // negations Operator !
        boolean negation = !a;
        System.out.println("a = true und wird negiert: " + negation); // false

        // SCE short-circuit-evaluation
        // die Kurzschluss-Auswertung betrachtet erst den linken Operanden, sollte dieser schon als false ausgewertet werden
        // bricht die weitere Auswertung ab
        boolean sce = a && b;
        System.out.println("sce: " + sce); // false
        sce = a || b;
        System.out.println("sce als Oder: " + sce); // true

    }
}
