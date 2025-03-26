package _2503;

public class InkrementDekrement {
    public static void main(String[] args) {
        int zahl = 10;
        // 1. Ausgabe mit Postinkrement zahl wird erst ausgegeben und dann um 1 erhöht
        System.out.println(zahl++); // 10
        // 2. Ausgabe mit Präinkrement zahl wird erst um 1 erhöht und dann ausgegeben
        System.out.println(++zahl); // 12
        System.out.println(zahl--); // 12
        System.out.println(zahl); // 11



    }
}
