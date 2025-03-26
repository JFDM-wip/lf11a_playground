package _2603;

public class HundTest {
    public static void main(String[] args) {
        // Instanziieren eines Hund-Objektes mit verschiedenen Konstruktoren
//        Hund bobby = new Hund();
//        bobby.setColor("gelb");
//        Hund sam = new Hund("rot", "blaue", 30.0);
//        Hund peter = new Hund("gelb", "rot", 32.0, 100.0);
//        Hund bob = new Hund("blau", "grün", 40.0, 60, 34.0);

//        System.out.println(sam);

        Hund kleinerHund = new Hund("lila");
        kleinerHund.sit();
        System.out.println(Hund.getHundeZaehler());
        Hund neuerHund = new Hund("grün");
        System.out.println(Hund.getHundeZaehler());
    }
}
